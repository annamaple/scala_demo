package com.annamaple.meetingScala

trait EqualA {
  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

trait EqualB {
  def MethodB(int: Int): Int
}

trait TraitB extends EqualA {
  def mb(x: Any): String
}
// trait 特征
// 特征构造顺序
// 特征也可以有构造器，由字段的初始化和其他特征体中的语句构成。这些语句在任何混入该特征的对象在构造时都会被执行。
// 构造器的执行顺序：
// 调用超类的构造器；
// 特征构造器在超类构造器之后、类构造器之前执行；
// 特征由左到右被构造；
// 每个特征当中，父特征先被构造；
// 如果多个特征共有一个父特征，父特征不会被重复构造
// 所有特征被构造完毕，子类被构造。
// 构造器的顺序是类的线性化的反向。线性化是描述某个类型的所有超类型的一种技术规格。
class PointTrait(xc: Int, yc: Int) extends EqualA {
  var x: Int = xc
  var y: Int = yc

  override def isEqual(obj: Any): Boolean = {
    obj.isInstanceOf[PointTrait] && obj.asInstanceOf[PointTrait].x == x
  }
}

/**
 * @author xionglei
 * @create 2022-06-09 14:32   
 */
object TraitTest {
  def main(args: Array[String]): Unit = {
    val p1 = new PointTrait(2, 3)
    val p2 = new PointTrait(2, 4)
    val p3 = new PointTrait(3, 4)
    // true
    assert(p1.isEqual(p2))
    // false
    assert(p2.isNotEqual(p3))
  }
}
