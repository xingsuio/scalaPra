package com.imooc.streaming.zs.继承.抽象类

/**
  * 抽象类：
  *
  * 小结：
  * 在子类中覆盖抽象类的抽象方法时，不需要使用override关键字。
  *
  * 思考： 但是这块，不管用不用 override关键字，都可以实现，而起，还需要删除这个关键字。
  * 应该时为了，区分 继承 和 抽象类 吧....
  *
  *
  * 定义：
  * 如果在父类汇总，有某些方法无法立即实现，而需要依赖不通的子类来覆盖，重写实现自己不同的方法实现。
  * 此时可以将父类中的这些方法不给出具体的实现，只有方法签名，这种方法就是抽象方法。
  * 而一个类中如果有一个抽象方法，那么类就必须用abstract来声明为抽象类，此时抽象类时不可能实例化的。
  *
  *
  *
  *
  * 扩展类：
  * 在Scala中扩展类的方式和Java一样都是使用extends关键字
  * 重写方法：
  * 在Scala中重写一个非抽象的方法必须使用override修饰符
  */
abstract class AbstractDemo(name: String) {
  def sayHello:Unit
}

class StudentDemo(name: String) extends AbstractDemo(name) {

// override def sayHello: Unit = println("Hello " + name)  //不推荐这种用法，不需要写override关键字。要用，就用在非抽象类中
  def sayHello: Unit = println("Hello " + name)
}



object StudentDemo extends App {

  val li = new StudentDemo("lin")
  li.sayHello
}
