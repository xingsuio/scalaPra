package com.imooc.streaming.隐式转换和隐式参数

class Person(val name: String) {
  def sayHello = { println(s"Hello, My name is $name") }

  //交两个朋友
  def makeFriends(person: Person): Unit = {
    sayHello
    person.sayHello
  }
}

class Student(name: String) extends Person(name)
class Dog(val name: String)

//聚会时2个人交朋友
class Party[T <% Person](person1: Person, person2: Person) {
  person1.makeFriends(person2)
}




object Test extends App {

  implicit def dog2Person(dog: Dog): Person = {
    new Person(dog.name)
  }

  val zhangsan= new Person("zhangshan")
  val lisi = new Student("lisi")

  // [] 方括号中不写类型,会报错
  // No implicits found for parameter ev$1: T => Person
  new Party[Person](zhangsan, lisi)


  println("-----------------------------------")

  val wangwu = new Person("wangwu")
  val wangcai = new Dog("wangwai..")
  new Party[Person](wangwu, wangcai)
}
