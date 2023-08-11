package scala_basic
object Set_lianxi {
  def main(args: Array[String]): Unit = {
    var mySet=Set("Hadoop","Spark")
    mySet+="Scala"
    println(mySet)

//    val  MutableSet=Set("Database","BigData")
//    MutableSet+="Cloud Computing"
//    println(MutableSet)
  }

}
/*
集合  是不重复元素的容器 列表元素是按照插入的先后顺序来组织的 但是集合中的元素并不会记录元素的插入顺序 而是以 哈希 方法对元素的值进行组长 所以 它允许你快速地找到某个元素

集合包括 可变集合和不可变集合 分别位于scala.collection.mutable  scala.collection.immutable  缺省情况下创建的是不可变集
var mySet=Set("Hadoop","Spark")
mySet+="Scala"

如果声明一个可变集 则需要导入scala.collection.mutable.Set
val  MutableSet=Set("Database","BigData")
MutableSet+="Cloud Computing"

 */