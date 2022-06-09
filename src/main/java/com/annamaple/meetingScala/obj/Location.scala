package com.annamaple.meetingScala.obj

/**
 * @author xionglei
 * @create 2022-06-09 11:45   
 */
class Location(xc: Int, yc: Int, zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, zc: Int): Unit = {
    z += zc
    super.move(dx, dy)
    println("z now is: " + z)
  }
}
