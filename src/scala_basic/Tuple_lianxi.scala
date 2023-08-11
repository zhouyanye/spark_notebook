package scala_basic

object Tuple_lianxi {
  def main(args: Array[String]): Unit = {
    val tuple=("BigData",2023,37.5)
    //tuple: (String, Int, Double) = (BigData,2023,37.5) scala解释器返回的执行结果
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
  }
}
/*
元组是不同类型的值的聚集 元组和列表不同 列表中各个元素必须是相同类型 而元组可以包含不同类型的元素
val tuple=("BigData".2015,45.0)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
 */
