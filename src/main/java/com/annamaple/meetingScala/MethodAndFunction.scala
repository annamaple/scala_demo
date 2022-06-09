package com.annamaple.meetingScala

/**
 * @author xionglei
 * @create 2022-06-09 9:45   
 */
class MethodAndFunction {
  // Scala 中使用 val 语句可以定义函数，def 语句定义方法。
  // def functionName ([参数列表]) : [return type]
  // 如果你不写等于号和方法主体，那么方法会被隐式声明为抽象(abstract)，包含它的类型于是也是一个抽象类型。
  // def 语句定义方法。 val 语句可以定义函数
  def m(x: Int): Int = x + 3
  val f: Int => Int = (x: Int) => x + 4

  // 如果方法没有返回值，可以返回为 Unit，这个类似于 Java 的 void, 实例如下：
  def voidF(x: Int): Unit = {
    println("voidF -param x: " + x)
  }
}
