package com.imooc.streaming.zs.对象.单例对象

import scala.collection.mutable.ArrayBuffer


/**
  * 小结：
  * 1）object里面的方法都是静态方法
  * 2）object里面的字段都是静态字段
  * 它本身就是一个单例，因为不需要去new
  */
object SingletonDemo extends App {

  val session = println(SessionFactory.getSession())

}

class Session{}

object SessionFactory{

  //该部分相当于Java中的静态块
  var counts = 5
  val sessions = new ArrayBuffer[Session]()
  while (counts > 0){
    sessions += new Session
    counts -= 1
  }

  //在object中的方法相当于Java中的静态方法
  def getSession(): Session = {
    sessions.remove(0)
  }
}
