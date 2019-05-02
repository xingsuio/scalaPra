package com.imooc.streaming.隐式转换和隐式参数

import java.io.File

import scala.io.Source

class RichFile(val file: File)  {

  //定义一个read方法，返回String类型
  def read(): String = Source.fromFile(file.getPath).mkString
}

object RichFile {

  //隐式转换方法 （将原有的File类型转成了file类型，在用的时候需要导入想要的包）
//  implicit def file2RichFile(file: File) = new RichFile(file)
}

object ImplicitChangeDemo extends App {

  val file = new File("/Users/hadoop/data/student.txt")

  //装饰模式，显示的增强（本来想实现: val contents = file.read()，但是却使用RichFile的方式，
  // 所以显示的增强）
  val rf = new RichFile(file)
  val str = rf.read()
  print(str)

}
