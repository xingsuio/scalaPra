package  zs {

  package navigation {

    //如果为private class Navigator,则类Navigator只会对当前包navigation中所有类型可见
    //即private默认省略了[x],X为当前包或者当前类或者当前单例对象
    //private[zs]则表示将类Navigator从当前包扩展到对zs包中的所有类型可见
    private [zs] class Navigator {
      protected[navigation] def userStarChart() {}
      class LegOfJourney {
        private [Navigator] val distance = 100
      }

      //this关键字控制更加严格,只有该类,和内部类内部方法可以访问,且只能直接调用而不能通过实例调用
      private [this] var speed = 200

    }
  }

  package launch {

    import zs.navigation.Navigator

    object Veicle {
      //private val guide: 表示guide默认被当前单例对象可见
      //private[launch] val guide: 表示guide由默认当前单例对象可见扩展到对launch包中的所有类型可见
      private [launch] var guide = new Navigator
    }
  }
}
