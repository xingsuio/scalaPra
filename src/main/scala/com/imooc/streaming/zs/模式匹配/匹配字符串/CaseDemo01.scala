package com.imooc.streaming.zs.模式匹配.匹配字符串

import scala.util.Random


object CaseDemo01 extends App {

  val arr = Array("hadoop","scala","spark")
  val name = arr(Random.nextInt(arr.length))
  name match {
    case "hadoop" => println("zhangsan")
    case "scala" => println("lisi")
    case _ => println("这是什么。。。。")
  }

}
