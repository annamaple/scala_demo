package com.annamaple.meetingScala

/**
 * Scala访问修饰符
 *
 * @author xionglei
 */
class Scala02 {
  //  私有(Private)成员
  //用 private 关键字修饰，带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。
  class Outer {
    class Inner {
      /*private*/ def f(): Unit = {
        println("f")
      }
      class InnerInner() {
        f()
      }
    }
    (new Inner).f()
  }
}
