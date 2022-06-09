package com.annamaple.meetingScala

abstract class Tree

case class Sum(l: Tree, r: Tree) extends Tree

case class Var(n: String) extends Tree

case class Const(v: Int) extends Tree

/**
 * @author xionglei
 * @create 2022-06-09 19:13   
 */
object TreeTest {

  type Environment = String => Int

  def eval(t: Tree, env: Environment): Int = t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n) => env(n)
    case Const(v) => v
  }

  val env: Environment = {
    case "x" => 5
    case "y" => 7
    case "z" => 9
  }

  def main(args: Array[String]): Unit = {
    var tree = Sum(Var("x"), Const(2))
    println(eval(tree, env))
  }
}
