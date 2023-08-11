package scala_object

  object get_set_lianxi {
    def main(args: Array[String]): Unit = {
      val test = new Counter // 创建一个 Counter 对象，名为 test
      println(test.value) // 打印默认值 0，因为 private_value 初始值为 0
      test.value = 3 // 设置 value 的新值为 3，通过特殊的 setter 方法 value_= 来修改 private_value
      println(test.value) // 打印新值 3
      test.increment(1) // 步长为 1，每次增加 1，因此 private_value 变为 4
      println(test.current) // 打印当前值 4
    }
    class Counter {
      private var private_value = 0 // 私有字段 private_value，初始值为 0
      // 定义一个方法 value，用于获取私有字段 private_value 的值
      def value = private_value
      // 定义特殊的 setter 方法 value_=，用于设置私有字段 private_value 的值
      def value_=(newValue: Int): Unit = {
        // 提供的新值是整数大于 0 才可以修改 private_value
        if (newValue > 0) private_value = newValue
      }
      // 定义一个方法 increment，用于按照给定步长增加 private_value 的值
      def increment(step: Int): Unit = { value += step }
      // 定义一个方法 current，用于获取当前 private_value 的值
      def current(): Int = { value }
    }

  }
/*
给类中的字段设置值以及读取值 在java中通过getter和setter方法实现的
在scala中 也提供了getter和setter方法的实现 但是并没定义成getxxx和setxxx
#
  def main(args: Array[String]): Unit = {
    val hh=new Counter
    println(hh.value)//不是用get获取字段值
    hh.value=3//不是用set设置字段的值
    hh.increment(1)//步长为1 每次＋1
    println(hh.current)
  }
 class Counter{
   var value=0
   def increment(step:Int):Unit={value+= step}
   def current():Int={value}
 }

#
#value变成私有字段以后 scala没提供get和set方法 *咋访问value方案呢* 可以通过定义类似get和set方法 分别叫做value和value_=
#
object get_set_lianxi {
  def main(args: Array[String]): Unit = {
    val test=new Counter
    println(test.value)//打印value默认值
    test.value=3//设置value新的值
   test.increment(1)//步长为1 每次＋1
    println(test.current)
  }
 class Counter{
 private  var private_value=0
 def value=private_value
  def value_=(newValue :Int){
      if (newValue >0) private_value=newValue
 }
 def increment(step:Int):Unit={value+= step}
   def current():Int={value}
}


 */