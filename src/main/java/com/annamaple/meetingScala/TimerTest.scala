package com.annamaple.meetingScala

import java.time.LocalTime
import java.util.concurrent.TimeUnit

class T(name :String, age: Int) {
  def getName = name
  def getAge = age
}

/**
 * @author xionglei
 * @create 2022-06-09 17:56   
 */
object TimerTest {

  def oncePerSecond(callback: (String) => Unit): Unit = {
    while (true) {
      callback(LocalTime.now().toString)
      TimeUnit.SECONDS.sleep(3)
    }
  }

  def timeFlies(string: String): Unit = {
    println("time flies like an arrow..." + string)
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond((x: String) => println("now is : " + x))
  }

}
