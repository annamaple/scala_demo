package com.annamaple.meetingScala

/**
 * @author xionglei
 * @create 2022-06-09 11:03   
 */
object ListTest {

  // Scala 集合分为可变的和不可变的集合。
  //可变集合可以在适当的地方被更新或扩展。这意味着你可以修改，添加，移除一个集合的元素。
  //而不可变集合类，相比之下，永远不会改变。不过，你仍然可以模拟添加，移除或更新操作。但是这些操作将在每一种情况下都返回一个新的集合，同时使原来的集合不发生改变。

  def main(args: Array[String]): Unit = {
    // List
    var site: List[String] = List("aa", "bb", "cc")
    var nums: List[Int] = List(1, 2, 3)
    // 空列表
    var empty: List[Nothing] = List()
    // 二维
    val dim: List[List[Int]] = List(
      List(1, 0),
      List(1),
      List(1, 2, 3)
    )
    // 构造列表的两个基本单位是 Nil 和 :: Nil 也可以表示为一个空列表。以上实例我们可以写成如下所示：
    var site1 = "aa" :: ("bb" :: ("cc" :: Nil))
    var nums1 = 1 :: (2 :: (3 :: Nil))
    // 空列表
    var empty1 = Nil
    // 二维
    val dim1 =
      (1 :: (0 :: Nil)) ::
        (1 :: Nil) ::
        (1 :: (2 :: (3 :: Nil))) :: Nil

    // Scala列表有三个基本操作：
    //head 返回列表第一个元素
    //tail 返回一个列表，包含除了第一元素之外的其他元素
    //isEmpty 在列表为空时返回true
    println("site1.head: " + site1.head)
    println("nums1.tail: " + nums1.tail)

    // List.fill() 方法来创建一个指定重复数量的元素列表
    val fillList = List.fill(10)("as")
    println(fillList)

  }
}
