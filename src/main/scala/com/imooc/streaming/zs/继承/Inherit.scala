package com.imooc.streaming.zs.继承

class Peopel {
  private var name = "xiaoming"
  def getName = name
}

class Student extends Peopel {
  private var score = 25
  def getScore = score

  override def getName: String = super.getName + ": lin"
}


// Test
object Inherit extends App {

  val student = new Student
  println(student.getName)

}
