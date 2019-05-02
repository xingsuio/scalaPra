package com.imooc.streaming.zs.类的定义和构造器

/**
  * 每个类都有主构造器，主构造器的参数直接放置类名后面，与类交织在一起
  *
  */
class Person (val name: String, val age: Int){

  //主构造器会执行类定义中的所有语句
  println("Hello Spark")

  val x = 1
  if( x > 1){
    println("666")
  }
  else if(x < 1){
    println("xixi>>")
  }
  else {
    println("huhu...")
  }

  println("----------------------")

  private var address = "BJ"
  //用this关键字定义辅助构造器
  def this(name: String, age: Int, address: String) {

    //每个辅助构造器必须以主构造器或其他的辅助构造器的调用开始
    this(name,age)
    println("执行辅助构造器")
    this.address = address
  }
}

object Person extends App{
  //此处可以调用  Person (val name:String, val age:Int)
  //也可以调用 this(name: String,age: Int, address: String)
  //相对于Java来说，更加灵活，更加方便
  val personMaster = new Person("kk", 18 )
  println(personMaster)
  val personSlave = new Person("ww", 22, "GZ")
  println(personSlave)
}
