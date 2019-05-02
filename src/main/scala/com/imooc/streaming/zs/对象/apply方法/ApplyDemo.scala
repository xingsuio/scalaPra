package com.imooc.streaming.zs.对象.apply方法

/**
  *
  * 小结：
  * 通过我们会在类的伴生对象中定义apply方法，当遇到类名（para1,...paran）时apply方法会被调用
  *
  * 直接调用，使用的是 Array数组 中 单例对象的apply方法
  *
  * new后调用，使用的是Array数组中 final class中的apply方法
  */
object ApplyDemo extends App {

  //调用Array伴生对象的apply方法
  var array = println(Array(1, 2, 3, 4, 5).toBuffer)

  /*
object Array extends FallbackArrayBuilding {
  /** Creates an array of `Int` objects */
  // Subject to a compiler optimization in Cleanup, see above.
  def apply(x: Int, xs: Int*): Array[Int] = {
    val array = new Array[Int](xs.length + 1)
    array(0) = x
    var i = 1
    for (x <- xs.iterator) { array(i) = x; i += 1 }
    array
  }
}
*/

  //new了一个长度为9的数组，数组里面包含了9个null
  var arr = println(new Array(9).toBuffer)

  /*
final class Array[T](_length: Int) extends java.io.Serializable with java.lang.Cloneable {
  /** The element at given index.
    *
    * Indices start at `0`; `xs.apply(0)` is the first element of array `xs`.
    * Note the indexing syntax `xs(i)` is a shorthand for `xs.apply(i)`.
    *
    * @param    i the index
    * @return the element at the given index
    * @throws       ArrayIndexOutOfBoundsException if `i < 0` or `length <= i`
    */
  def apply(i: Int): T = throw new Error()
}
*/

}
