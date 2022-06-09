package com.annamaple.meetingScala

/**
 * @author xionglei
 * @create 2022-06-09 11:33   
 */
object OptionTest {

  def main(args: Array[String]): Unit = {
    // Scala Option(选项)类型用来表示一个值是可选的（有值或无值)。
    // Option[T] 是一个类型为 T 的可选值的容器： 如果值存在， Option[T] 就是一个 Some[T] ，如果不存在， Option[T] 就是对象 None 。
    // 虽然 Scala 可以不定义变量的类型，不过为了清楚些，我还是
    // 把他显示的定义上了
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")

    println(value1) // Some("value1")
    println(value2) // None
  }

}
