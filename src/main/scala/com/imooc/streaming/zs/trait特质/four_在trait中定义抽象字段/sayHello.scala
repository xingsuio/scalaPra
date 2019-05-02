package com.imooc.streaming.zs.trait特质.four_在trait中定义抽象字段

/**
  *
  * 具体，还是需要看一下，trait和抽象属性，抽象方法，抽象类，class之间的关系
  *
  * 如果一个类继承了trait，但是并没有实现其抽象属性或者抽象方法，
  * 那么该类必须加abstract字段，意思就是说这个类必须为抽象类
  *
  * Scala中Triat可以定义抽象field，而trait中的具体方法则可以基于抽象field来编写
  * 但是继承trait的类，则必须覆盖抽象field，提供具体的值
  */
trait sayHello {

  //抽象属性
  val msg: String
  def sayHello(name: String) = println(s"$msg,$name")
}

class Person(val name: String) extends sayHello {
  val msg: String = "hello"

  sayHello(name)

//  def makeFriends(p: Person): Unit = {
//    sayHello(p.name)
//    println(s"I'm $name, I want to make friends with you!")
//  }
}

object Test extends App {
  val p1 = new Person("zhangsan")
  val p2 = new Person("wangwu")
//  p1.makeFriends(p2)

  p1.sayHello("dd")
}
