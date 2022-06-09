package com.annamaple.meetingScala.obj

/**
 * @author xionglei
 * @create 2022-06-09 11:40   
 */
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
    println("x now is: " + x)
    println("y now is: " + y)
  }
}
