package com.imooc.streaming.zs.trait特质.three_在trait中定义具体字段

/**
  * 小结：（避免重复定义多个重复属性）
  * 结成trait获取去的field，会被直接添加到所继承的类中，不用再去从父类中调用
  * 直接继承class获取到的field，实际使用的是父类中的field
  *
  *
  * Scala中的Trait可以定义具体field，此时继承trait的类就自动获得了trait中定义的field，
  * 但是这种获取field的方式与继承class是不同的，如果是继承class获取的field，实际是定义在父类中的；
  * 而继承trait获取的field，就直接被添加到了类中
  */
trait Person {


//  //定义抽象方法
//  def logs(message: String)
//
//  //定义抽象属性
//  var eyeNums:Int

  //定义具体字段
  val eyeNum: Int = 2

  //定义具体方法
  def log(message: String) = println(message)

}


class Student(val name: String) extends Person {


  def sayHello() = println(s"Hi, i'm $name , I have $eyeNum eyes !")
}

object Test extends App {
  val s = new Student("zhangsan")
  s.sayHello()
}
