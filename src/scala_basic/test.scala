package scala_basic

object test {
  def main(args: Array[String]): Unit = {
    val range = 1 to 5
    // 或者 val range = 1.to(5)
    for (i <- range) {
      println(i)              //上述代码创建了一个数值序列range，其中包含从1到5的整数。然后，使用for循环遍历该数值序列并打印每个值。
    }
  }
}
