package com.imooc.streaming.zs.模式匹配.匹配类型

import com.imooc.streaming.zs.模式匹配.匹配字符串.CaseDemo01

import scala.util.Random

/**
  * 注意：case y: Double if (y>= 0) => ....
  * 模式匹配的时候还可以添加守卫条件。如不符合守卫条件，将掉入case _ 中
  */
object CaseDemo02 extends App {

  val arr = Array("hello", 1, 2.0, CaseDemo01)
  val v = arr(Random.nextInt(4))
  v match {
    case x: Int => println(s"Int $x")
    case y: Double if(y >=0) => println(s"Double $y")
    case z: String => println(s"String $z")
    case _ => throw new Exception("no match exception")
  }


}
