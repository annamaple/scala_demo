package com.annamaple.meetingScala

import scala.util.matching.Regex

/**
 * @author xionglei
 * @create 2022-06-09 14:59   
 */
object RegexTest {

  // Scala 通过 scala.util.matching 包中的 Regex 类来支持正则表达式
  def main(args: Array[String]): Unit = {
    val pattern: Regex = "Scala".r
    val str = "Scala is Scalable and cool"
    println(pattern findFirstIn str)

    // mkString( ) 方法来连接正则表达式匹配结果的字符串，并可以使用管道(|)来设置不同的模式
    val p2 = new Regex("(S|s)scala")
    println(p2 findAllIn (str))
  }
}
