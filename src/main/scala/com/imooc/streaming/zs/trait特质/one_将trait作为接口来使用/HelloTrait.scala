package com.imooc.streaming.zs.trait特质.one_将trait作为接口来使用

/**
  * Scala中的Trait是一种特殊的概念
  * 首先我们可以将Trait作为接口来使用，此时的Trait就与Java中的接口非常类似
  * 在trait中可以定义抽象方法，就与抽象类汇总的抽象方法一样，只要不给出方法的具体实现即可
  * 类可以使用extends关键字继承trait，注意，这里不是implement，而是extends,在scala中没有implement的概念，无论继承类还是trait，同一都是extends
  *
  * 类继承trait后，必须实现其中的抽象方法，实现时不需要使用override关键字
  * scala不支持对类进行多继承，但是支持剁成继承trait，使用with关键字即可
  */
trait HelloTrait {

  //定义一个sayHell方法，传入name参数
  def sayHello(name: String)
}

trait MakeFriendsTrait {

  //定义一个makeFriends方法，传入w参数
  def makeFriends(w: Worker)
}

/**
  * Worker同时实现 HelloTrait和MakeFriendsTrait 接口
  * 此处的接口重写，不需要使用override关键字
  */
class Worker(var name: String) extends HelloTrait with MakeFriendsTrait {

  //重写HelloTrait接口中的sayHello方法
  def sayHello(name: String) = println("hello ," + name)

  //重写makeFriendsTrait接口中的sayHello方法
  def makeFriends(w: Worker) = println("hello, my name is " + name + " you name is " + w.name)
}

// 测试Worker类实现的两个接口中的方法
object Test extends App {

  val p1 = new Worker("zhangsan")
  val p2 = new Worker("wangwu")
  p1.sayHello("wangwu") //hello ,wangwu
  p1.makeFriends(p2)        //hello, my name is zhangsan you name is wangwu
}
