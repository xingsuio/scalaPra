package com.imooc.streaming.zs.trait特质.two_在trait中定义具体方法

trait Logger {

  def log(message: String) = println(message)
}


class Person(val name: String) extends Logger {

  def makeFriends(p: Person): Unit = {
    //此处用插值，对于常量，直接用 $name即可， 调用方法，需要使用花括号 括起来  ${p.name}
    println(s"I'm $name i'm glade to make friends with you ${p.name}" )
    log("makeFriends method invoked!!")

  }
}

object Test extends App {
  val p1 = new Person("zhangsan")
  val p2 = new Person("wangwu")
  p1.makeFriends(p2)
}

