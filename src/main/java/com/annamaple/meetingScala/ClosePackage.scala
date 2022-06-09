package com.annamaple.meetingScala

/**
 * 闭包
 *
 * @author xionglei
 * @create 2022-06-09 10:41   
 */
object ClosePackage {

  // 闭包是一个函数 val，返回值依赖于声明在函数外部的一个或多个变量。
  // 闭包通常来讲可以简单的认为是可以访问一个函数里面局部变量的另外一个函数。

  def main(args: Array[String]): Unit = {
    println(multiplier(12))
  }

  var factor = 3;
  val multiplier: Int => Int = x => x + factor
}
