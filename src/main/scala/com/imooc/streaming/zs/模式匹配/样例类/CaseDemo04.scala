package com.imooc.streaming.zs.模式匹配.样例类

import scala.util.Random

/**
  * 小结：
  * 本质上来讲, class 、case class 用起来就是一样的
  *   最不一样的东西： 如果我们scala要做模式匹配，去匹配类型的话，建议使用
  *
  * case class 因为scala的底层对它做了优化，匹配起来性能较好
  *
  * 1、 case class 自动生成伴生对象，自动实现了apply方法
  * 2、 case class 用于做匹配，性能较好（scala的底层做过优化）
  * 3、 case class 默认实现了序列化 Serializable
  * 4、 case class 默认实现了toString、equals等方法
  *
  * 5、 case class 主构造函数里面没有修饰符，默认的是val
  */

object CaseDemo04 extends App {

  val arr= Array(CheckTimeOutTask, HeartBeat(222222), SubmitTask("zs","ls"))

  arr(Random.nextInt(arr.length)) match {

    case SubmitTask(id, name) => println(s"$id, $name")
    case HeartBeat(time) => println(time)
    case CheckTimeOutTask => println("check")
  }
}

case class SubmitTask(id: String, name: String)
case class HeartBeat(time: Long)
case object CheckTimeOutTask