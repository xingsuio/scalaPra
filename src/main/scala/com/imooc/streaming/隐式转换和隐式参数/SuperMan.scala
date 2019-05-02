package com.imooc.streaming.隐式转换和隐式参数

class Man(val name: String)
class SuperMan {
  def fly(): Unit = {
    println("我要上天")
  }
}
object SuperMan  {

//  implicit def man2SuperMan(man: Man) = new SuperMan {
//    new Man("灰太狼").fly()
//  }
}
