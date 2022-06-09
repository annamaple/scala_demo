package com.annamaple.meetingScala

// 模式匹配
class Switch {
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "many"
  }
}

// 样例类
case class Person(name: String, age: Int)


/**
 * @author xionglei
 * @create 2022-06-09 14:47   
 */
object CaseTest {

  def main(args: Array[String]): Unit = {
    println(new Switch().matchTest(2))
    
    val alice = Person("Alice", 22)
    val bob = Person("Bob", 32)
    val charlie = Person("Charlie", 42)
    
    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 22) => println("1: Hi, " + person.name)
        case Person("Bob", 32) => println("2: Hi, " + person.name)
        case Person("Charlie", 42) => println("3: Hi, " + person.name)
      }
    }
  }
}
