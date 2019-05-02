package com.imooc.streaming.隐式转换和隐式参数

import java.io.File

import scala.io.Source

class RichFile(val file: File)  {

  //定义一个read方法，返回String类型
  def read(): String = Source.fromFile(file.getPath).mkString
}

object RichFile {

  //隐式转换方法 （将原有的File类型转成了file类型，在用的时候需要导入想要的包）
    implicit def file2RichFile(file: File) = new RichFile(file)
}

object ChangeDemo02 extends App {

  //目的是使用File的时候不知不觉的时候直接使用file.read()方法，所以这里就要做隐式转换
  val file = new File("/Users/hadoop/data/student.txt")

  //导入隐式转换， ._将它下满的所有的方法都导入进去了
  import RichFile._

  //这里没有的read()方法的时候，它就到上面的这一行中的找带有implicit的定义方法
  var str = file.read()
  //打印读取的内容
  println(str)


}
