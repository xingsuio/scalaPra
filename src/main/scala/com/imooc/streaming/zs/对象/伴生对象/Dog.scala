package com.imooc.streaming.zs.对象.伴生对象


/**
  *
  * 小结：
  * 伴生对象和伴生类可以互相访问私有属性和私有方法
  *
  *
  * class和object，
  * 要在object中使用class中的方法，直接new来进行实例化，然后再调用
  * 在class中调用object中的方法，直接调用，不需要new
  */
class Dog{
  val id = 666
  private var name = "wangcai"
  private def printName():Unit = {
    //在Dog中可以访问伴生对象的Dog私有属性
    println(Dog.CONSTANT + name)
  }

}


/**
  * 伴生对象
  */
object Dog extends App {

  //伴生对象中的私有属性
  private val CONSTANT = "汪汪汪..."

  //主方法
  val dog = new Dog
  dog.name = "wangcaiss"
  dog.printName()

}
