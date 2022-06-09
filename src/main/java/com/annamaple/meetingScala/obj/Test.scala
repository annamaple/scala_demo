package com.annamaple.meetingScala.obj

/**
 * @author xionglei
 * @create 2022-06-09 11:43   
 */
object Test {
  def main(args: Array[String]): Unit = {
    var point = new Point(10, 10)
    point.move(1, 1)

    // Scala继承一个基类跟Java很相似, 但我们需要注意以下几点：
    // 1、重写一个非抽象方法必须使用override修饰符。
    // 2、只有主构造函数才可以往基类的构造函数里写参数。
    // 3、在子类中重写超类的抽象方法时，你不需要使用override关键字。
    var location = new Location(11, 11, 11)
    location.move(2, 2, 2)
    
    // 在 Scala 中，是没有 static 这个东西的，但是它也为我们提供了单例模式的实现方法，那就是使用关键字 object。
    // Scala 中使用单例模式时，除了定义的类之外，还要定义一个同名的 object 对象，它和类的区别是，object对象不能带参数。
    // 当单例对象与某个类共享同一个名称时，他被称作是这个类的伴生对象：companion object。
    // 你必须在同一个源文件里定义类和它的伴生对象。
    // 类被称为是这个单例对象的伴生类：companion class。类和它的伴生对象可以互相访问其私有成员。
    
  }
}
