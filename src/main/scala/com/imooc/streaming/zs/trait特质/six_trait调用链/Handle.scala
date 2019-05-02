package com.imooc.streaming.zs.trait特质.six_trait调用链


/**
  *
  * 1 Scala中支持让类继承多个trait后，依次调用多个trait中的同一个方法，只要让多个trait的同一个方法中，在最后都执行super. 方法 即可
  *
  *
  * 2 类中调用多个trait中都有的这个方法时，首先会从最右边的trait的方法开始执行，然后依次往左执行，形成一个调用链条
  *
  * class SparkConf(loadDefaults: Boolean) extends Cloneable with Logging with Serializable {}
  * 方法的执行顺序，从右往左执行： Serializable、Logging、Cloneable
  *
  * 如果  为实例对象混入trait，则先执行混入triat的方法或属性
  *
  *
  *3  这种特性非常强大，其实就相当与设计模式中的责任链模式的一种具体实现依赖
  *
  *
  */

//定义父类triat
trait Handle {
  def handle(data: String){}
}

//DataValidHandler继承父类triat
trait DataValidHandler extends Handle {
  override def handle(data: String): Unit = {
    println(s"check data: $data")
    super.handle(data)
  }
}

//SignatureValidHandler继承父类trait
trait SignatureValidHandler extends Handle {
  override def handle(data: String): Unit = {
    println(s"check signatrue $data")
    super.handle(data)
  }
}

//Person类同时继承SignatureValidHandler和DataValidHandler继承父类triat
//（注意继承顺序，从最右边的trait方法开始执行，然后依次往左执行，形成一个调用链条）
class Person(val name: String) extends SignatureValidHandler with DataValidHandler {

  def sayHello = {
    println(s"Hello $name")
    handle(name)
  }
}

object Test extends App {
  val p = new Person("zhangsan")
  p.sayHello
}

