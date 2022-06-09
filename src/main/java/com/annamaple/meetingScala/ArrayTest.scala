package com.annamaple.meetingScala

/**
 * @author xionglei
 * @create 2022-06-09 10:47   
 */
object ArrayTest {

  def main(args: Array[String]): Unit = {
    // 定义数组的方式
    var z1: Array[String] = new Array[String](4)
    var z2 = new Array[String](4)
    var z3: Array[String] = Array("Bing", "Baidu", "Google")
    var z4 = Array("Bing", "Baidu", "Google")
    // 合并两个数组
    var z5 = Array.concat(z3, z4)
    z5.foreach(s => println(s))
    // 创建区间数组, 默认步长为1
    var nums = Array.range(10, 20, 1)
    println(nums.mkString("Array(", ", ", ")"))
  }

}
