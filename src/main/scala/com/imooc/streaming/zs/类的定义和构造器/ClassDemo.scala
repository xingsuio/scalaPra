package com.imooc.streaming.zs.类的定义和构造器

//在Scala中，类并不用声明为public
//Scala源文件中可以包含多个类，所有这些类都具有公有可见行
class ClassDemo {

  //用val修饰的变量是只读属性，有getter但没有setter方法
  //相当于Java中用final修饰的变量（可调用，但不可变，例如，常量的定义））
  val id = 666

  //用var修饰的变量既有getter又有setter方法
  val name = "zs"

  //在其他类中也可是使用，只需new就可以
  val age = 24

  //类私有字段，只能在类的内部使用,这个类指class类或object对象中，都可用。
  //类名要一致，都是同一个类
  //private val age = 24

  //私有的属性，要想再在外部类 ClassDemoS 中调用，需要加上，类外部类名称
//  private [ClassDemoS] val age =24




  //对象私有字段，访问权限更加严格，ClassDemo类的方法只能访问到当前对象的字段  private [this] 作用作用域，用的this关键字
  //仅能在这个类中使用，在单例对象中都是不能使用的
  private [this] val address = "guanzghou "
  //  println(address)

  //在外部对象中调用，可以加上 ClassDemo 类名
//  private [ClassDemo] val address = "guanzghou "




}

// 测试
object ClassDemo extends App {

  val classDemo = new ClassDemo
  println(classDemo.id);
  println(classDemo.age);
//  println(classDemo.address);
  println(classDemo.age)

}

// 测试
object ClassDemoS extends App {

  val classDemo = new ClassDemo
  println(classDemo.id);
  //  println(classDemo.address);
  println(classDemo.age)

}