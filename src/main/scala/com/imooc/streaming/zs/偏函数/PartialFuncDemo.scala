package com.imooc.streaming.zs.偏函数


/**
  * 偏函数定义：
  * 被包在花括号内没有match的一组case语句是一个偏函数，它是PartialFunction[A,B]的一个实例
  * A代表参数类型，B代表返回类型，常用作输入模式匹配
  *
  * 小结：
  * 偏函数就是用来做模式匹配的
  *
  *
  * Lication：
  * /Users/hadoop/app/maven/repo/org/scala-lang/scala-library/2.11.8/
  * scala-library-2.11.8-sources.jar!/scala/PartialFunction.scala
  *
  *
  * private[this] val fallback_pf: PartialFunction[Any, Any] = { case _ => fallback_pf }
  * private def checkFallback[B] = fallback_pf.asInstanceOf[PartialFunction[Any, B]]
  * private def fallbackOccurred[B](x: B) = (fallback_pf eq x.asInstanceOf[AnyRef])
  *
  * private class Lifted[-A, +B] (val pf: PartialFunction[A, B])
  * extends scala.runtime.AbstractFunction1[A, Option[B]] {
  *
  * def apply(x: A): Option[B] = {
  * val z = pf.applyOrElse(x, checkFallback[B])
  * if (!fallbackOccurred(z)) Some(z) else None
  * }
  * }
  *
  *
  *
  */
object PartialFuncDemo extends App {

  // String代表传入参数， Int代表返回值类型
  // 此处不需要再使用match
  // PartialFunction就是用来做模式匹配的
  def func1: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def func2(num: String): Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }


  println(func1("one"))
  println(func2("dd"))

}
