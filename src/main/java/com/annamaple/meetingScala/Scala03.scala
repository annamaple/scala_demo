package com.annamaple.meetingScala

/**
 * @author xionglei
 * @create 2022-06-09 9:29   
 */
class Scala03 {
  //用 private 关键字修饰，带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。
  private def privateF(): Unit = {
    println("privateF")
  }
  
  //在 scala 中，对保护（Protected）成员的访问比 java 更严格一些。
  // 因为它只允许保护成员在定义了该成员的的类的子类中被访问。
  // 而在java中，用 protected关键字修饰的成员，除了定义了该成员的类的子类可以访问，同一个包里的其他类也可以进行访问。
  protected def protectedF(): Unit = {
    println("protectedF")
  }
  
  // Scala 中，如果没有指定任何的修饰符，则默认为 public。这样的成员在任何地方都可以被访问。
  def publicF(): Unit = {
    println("publicF")
  }
  
  // Scala中，访问修饰符可以通过使用限定词强调。格式为: private[x] protected[x]
  // 这里的x指代某个所属的包、类或单例对象。
  // 如果写成private[x],读作"这个成员除了对[…]中的类或[…]中的包中的类及它们的伴生对像可见外，对其它所有类都是private。
  // 这种技巧在横跨了若干包的大型项目中非常有用，它允许你定义一些在你项目的若干子包中可见但对于项目外部的客户却始终不可见的东西。
  
}
