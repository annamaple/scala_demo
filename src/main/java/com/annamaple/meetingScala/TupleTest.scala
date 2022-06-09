package com.annamaple.meetingScala

/**
 * @author xionglei
 * @create 2022-06-09 11:24   
 */
object TupleTest {

  def main(args: Array[String]): Unit = {
    // 元组
    val t: (Int, String, List[Int], Map[String, String]) = (1, "1", List.range(0, 10), Map("red" -> "#FF0000", "azure" -> "#F0FFFF"))
    println(t)
    var t2 = new Tuple2[String, Int]("annamaple", 12)
    t2.productIterator.foreach(i => println("value = " + i))
  }

}
