package com.imooc

package  streaming {

  class Super{
    protected def f() {println("f")}

    class Sub extends Super { f() }  //可以访问

    class Other { (new Super).f() }  //不可访问
  }
}
