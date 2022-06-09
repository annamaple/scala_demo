package com.annamaple.meetingScala

import java.io.{FileNotFoundException, FileReader, IOException}

/** 异常处理
 *
 * @author xionglei
 * @create 2022-06-09 17:21
 */
object ExceptionTest {

  def test1(): Unit = {
    try {
      val f = new FileReader("ttt.txt")
    } catch {
      case e: FileNotFoundException =>
        println("FileNotFountException")
      case e: IOException =>
        println("IOException")
    } finally {
      println("Finally")
    }
  }

  def test2(): Unit = {
    try {
      var reader = new FileReader("ttt.txt")
    } catch {
      case e: FileNotFoundException =>
        println(e.getMessage)
    }
  }

  def main(args: Array[String]): Unit = {
    //    test1()
    test2()
  }
}
