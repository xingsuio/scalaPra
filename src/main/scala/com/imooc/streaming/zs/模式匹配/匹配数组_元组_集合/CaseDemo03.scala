package com.imooc.streaming.zs.模式匹配.匹配数组_元组_集合


/**
  * 注意：在Scala中列表要么为空（Nil表示空列表（list）），要么是一个head元素加上一个tail列表
  *
  * 9 :: List(5,2)  :: 操作符是将给定的头和尾创建一个新的列表
  *
  * 注意： :: 操作符是右结合的，如 9 :: 5 :: 2 :: Nil 相当与 9 :: (5 :: (2 :: Nil))
  */
object CaseDemo03 extends App {

  //数组
/*
  val arr = Array(1,3,5)
  arr match {
    case Array(1,x,y) => println(s"$x $y")
    case Array(0) => println("only 0")
    case Array(0, _*) =>println("0 ...")
    case _ => println("something else")
  }
*/

  //list
/*
  //  val list = List(3, -1, 2)  //something else
  val list = List(3, -1)   // x: 3 y: -1
  list match {
    case 0 :: Nil => println("only 0")
    case x :: y :: Nil => println(s"x: $x y: $y")
    case 0 :: tail => println("0 ...")
    case _ => println("something else")
  }
*/

  // 元组 不太懂，大量练习
  val tuple = (2, 3, 5)
  tuple match {
    case (2, x, y) => println(s"1, $x, $y")  // 第一个字段为2，后两个字段随意
    case (_, z, 5) => println(z)
    case _ => println("else")
  }
}



