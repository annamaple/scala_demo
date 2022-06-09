package com.annamaple.meetingScala

/**
 * @author xionglei
 * @create 2022-06-09 10:07   
 */
object MethodTest {

  // 定义方法m1, 参数是一个函数, 返回值为Int
  // 且m1函数参数的要求是有两个Int类型的参数, 返回Int类型结果
  def m1(f: (Int, Int) => Int, x: Int, y: Int): Int = {
    f(x, y)

  }

  // 定义一个函数f1, 参数是两个Int类型，返回值是一个Int类型
  val f1: (Int, Int) => Int = (x, y) => x + y
  val f2: (Int, Int) => Int = (a, b) => a * b

  // main方法
  def main(args: Array[String]): Unit = {
    val x1 = 1
    val x2 = 2
    val r1 = m1(f1, x1, x2)
    println("r1 = " + r1)
    val r2 = m1(f2, x1, x2)
    println("r2 = " + r2)

    // 方法里面传递方法，方法会自动转为函数
    //通过m0 _将方法转化成函数
    println(m2(m0 _, 12))
    //如果直接传递的是方法名称，scala相当于是把方法转成了函数
    println(m2(m0, 12))
    //通过x => m0(x)的方式将方法转化成函数,这个函数是一个匿名函数，等价：(x:Int) => m0(x)
    println(m2(x => m0(x), 12))
  }


  // 1、函数可作为一个参数传入到方法中，而方法不行。
  // 2、在Scala中无法直接操作方法，如果要操作方法，必须先将其转换成函数。有两种方法可以将方法转换成函数：
  // 3、函数必须要有参数列表，而方法可以没有参数列表

  // 定义方案m0
  def m0(x: Int): Int = {
    x * 10
  }

  // 将方法m0转为函数
  // val f0 = m0 _
  val f0: Int => Int = m0

  // 定义方法m2, 参数为函数和Int类型数
  // 且，对函数的要求是参数为一个Int类型, 返回为Int类型
  def m2(f: Int => Int, x: Int): Int = {
    f(x)
  }
}
