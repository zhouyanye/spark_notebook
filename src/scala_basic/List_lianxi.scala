package scala_basic

object List_lianxi {
  def main(args: Array[String]): Unit = {
    var strList = List("BigData", "Hadoop", "Spark") //一变量 strList 列表不可变
    println(strList)
    println("strList的第一个元素是",strList.head)
    println("strList除外的元素有",strList.tail)
    val otherList="Apache"::strList
    println("在strList前面追加的",otherList)
    var intList=1::2::3::Nil
    val hhList=List(1,2,3)
    println(intList)
    println(hhList)
  }

}
/*
列表是一种共享系统类型的不可变的对象序列 既然是一个不可变的集合 scala的List定义在scala.collection.immutable包中
不同于Java的java.util.List scala的List一旦被定义 其值就不能改变 因此声明List必须初始化

列表有头部和尾部的概念 可以分别使用head和tail方法来获取
head 返回列表第一个元素的值
tail 返回的是除开第一个元素外其他值 并构成新列表 这体现出列表具有链表结构
构造列表常用的方法是通过在已有列表前端增加元素  使用操作符::
 var strList = List("BigData", "Hadoop", "Spark") //一变量 strList 列表不可变
val otherList="Apache"::strList       //执行该语句strList保持不变 而otherList将成为一个新的列表

定义了一个空列表对象Nil 借助Nil可以将多个元素用操作符:: 串起来初始化一个列表
var intList=1::2::3::Nil  == val intList=List(1,2,3)
 */
