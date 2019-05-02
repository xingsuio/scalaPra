package com.imooc.streaming.zs.trait特质.five_为实例对象混入trait


/**
  *
  * 为实例对象混入trait（特质）

  * 为实例对象混入trait后，覆盖原有的triat中的方法或者属性，只在当前实例的对象中拥有
  *
  * 有时我们可以在创建类的对象时，指定该对象混入某个trait，
  * 这样，就只有这个对象混入该trait的方法，而类的其他对象则没有
  * 混入后，使用的是该对象（BMyLogger）的trait方法，而不使用原来的（AMyLogger）trait方法
  *
  *
  *
  *
  *
  * val p1 = new Person("zhangsan") //用AMyLogger的方法
  * val p2 = new Person("wangwu") with BMyLogger //如果方法一致重复，只生效BMyLogger中的方法，不一致，则使用原来的方法即可
  *
  *
  * trait定义的接口,不能传入参数
  */

//定义Logged的trait，log抽象方法
trait Logged {
  def log(msg: String){}
  def save() {}
}


// 定义AMyLooger继承Logged的trait， 都是trait，所以要重写该log方法
trait AMyLogger extends Logged {
  override def log(msg: String): Unit = {
    println(s"test: $msg")
  }

  override def save(): Unit = {
    println("save: helloworld!")
  }
}

// 同AMyLogger
trait BMyLogger extends Logged {
  override def log(msg: String): Unit = {
    println(s"log: $msg")
  }
}

// Person类 继承自 AMyLogger 特质（trait）, 重写log方法，不需要使用override关键自
class Person(val name: String) extends AMyLogger {

  def sayHello(): Unit = {
    println(s"Hi, I'm $name")
    log("sayHello is invoked!")
  }

  override def save(): Unit = super.save()
}



object Test extends App {

  //Person继承一个AMyLogger特质
  val p1 = new Person("zhangsan")
  p1.sayHello()
  p1.save()

  println("--------------------")
  //Person同时继承AMyLogger特质和BMyLogger特质(trait)
  //为这个实例对象混入trait，此处的是BMyLogger，
  //这样，就只有这个对象 Person 混入该trait的方法，而类的其他对象则没有

  //我认为，最后混入的该（BMyLogger）trait方法，它覆盖了原来（AMyLogger）trait中的方法
  val p2 = new Person("wangwu") with BMyLogger
  p2.sayHello()
  p2.save()
}
