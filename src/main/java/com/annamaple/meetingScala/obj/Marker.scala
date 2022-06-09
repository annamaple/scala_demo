package com.annamaple.meetingScala.obj

/**
 * @author xionglei
 * @create 2022-06-09 11:54   
 */
// 私有构造方法
class Marker private(val color: String) {

  println("create: " + this)

  override def toString: String = "color: " + color
}

// 单例模式，使用伴生对象
object Marker {
  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),
    "green" -> new Marker("green"),
    "blue" -> new Marker("blue")
  )

  def apply(color: String): Marker = {
    if (markers.contains(color)) markers(color) else null
  }

  def getMarker(color: String): Marker = {
    if (markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]): Unit = {
//    println(markers("red"))
    println(Marker getMarker "green")
  }
}
