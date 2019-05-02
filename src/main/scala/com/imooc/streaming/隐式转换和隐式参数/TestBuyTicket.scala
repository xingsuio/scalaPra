package com.imooc.streaming.隐式转换和隐式参数


//定义一个类，它有一个属性name，用var，说明会自动生成setter和getter方法，这个属性没有初始化，还是自动赋值为none呢？

//特殊人群（儿童和老人）
class SpecialPerson(var name:String)

//儿童
class Children(var name: String)

//老人
class Older(var name: String)

//青年工作者
class Worker(var name: String)

//特殊人群买票窗口
class TicketHouse {
  def buyTicket(p: SpecialPerson): Unit = {
    println(s"${p.name} 买到票了")
  }
}


object MyPredef {

  //隐式转换，将儿童转为特殊人群
  implicit def children2SpecialPerson(c: Children) = new SpecialPerson(c.name)

  //隐式转换，将老人转为特殊人群
  implicit def older2SpecialPerson(o: Older) = new SpecialPerson(o.name)
}


object TestBuyTicket extends App {

  val house = new TicketHouse

  // 没有导入隐式转换，报错   house.buyTicket(children)
  // Type mismatch, expected: SpecialPerson, actual: Children

  // 导入隐式对象后，可以使用 。 （Java中的反射）
  import MyPredef._

  //测试儿童买票
  val children = new Children("xiaoming")
  house.buyTicket(children)

  //测试老人买票
  val older = new Older("olderss")
  house.buyTicket(older)

  val worker = new Worker("liangqiang")
//  house.buyTicket(worker)  //此处不注释，程序就会报错



}



