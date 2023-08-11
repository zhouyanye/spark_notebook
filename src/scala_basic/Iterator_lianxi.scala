package scala_basic

object Iterator_lianxi {
  def main(args: Array[String]): Unit = {
    val iter=Iterator("Hadoop","Spark","Scala")//字符串迭代器名为iter
    for(elem<-iter){  //elem为变量名  自动遍历每个元素保存到elem
      println(elem)
    }
  }
/*
在scala中  迭代器不是一个集合 但是 提供了访问集合的一种方法
迭代器博包含两个基本操作 next和hasNext next可以返回迭代器的下一个元素 hasNext用于检测是否还有一个元素
    val iter=Iterator("Hadoop","Spark","Scala")//字符串迭代器名为iter
    while (iter.hasNext){  //hasNext判断是否还有下面一个元素 如果有则靠地下next获取并且输出下一个元素
      println(iter.next())
    }
val iter=Iterator("Hadoop","Spark","Scala")//字符串迭代器名为iter
        for(elem<-iter){    //elem为变量名  自动遍历每个元素保存到elem
      println(elem)
    }
##
Iterator 有两个方法返回迭代器 grouped和sliding 然而 这些迭代器返回的不是单个元素 而是原容器元素的全子序列 这些最大的是子序列作为参数传给这些方法
grouped方法返回元素的增量分块
###
grouped 方法：
grouped(n: Int): Iterator[Seq[A]] 方法将原集合中的元素按照指定的大小 n 进行分组，并返回一个新的迭代器，每个迭代器元素是原集合中的一组子序列（Seq[A]）。
如果原集合的元素个数不能整除 n，那么最后一组子序列的大小可能会小于 n。

sliding方法生成一个滑动元素的窗口 两者之间的差异通过repl的作用能够清楚看出
###
sliding 方法：
sliding(size: Int, step: Int): Iterator[Seq[A]] 方法生成一个滑动窗口的迭代器，窗口大小为 size，滑动步长为 step。
size 表示窗口的大小，即每个子序列的元素个数。
step 表示滑动的步长，即每次滑动的距离。
sliding 方法生成的迭代器包含了原集合中所有可能的滑动窗口子序列


scala> val xs=List(1,2,3,4,5)
xs: List[Int] = List(1, 2, 3, 4, 5)

scala> val git=xs grouped(3)
git: Iterator[List[Int]] = non-empty iterator

scala> git.next()
res0: List[Int] = List(1, 2, 3)

scala> git.next()
res1: List[Int] = List(4, 5)

scala> val sit=xs sliding(3)
sit: Iterator[List[Int]] = non-empty iterator

scala> sit.next()
res2: List[Int] = List(1, 2, 3)

scala> sit.next()
res3: List[Int] = List(2, 3, 4)

scala> sit.next()
res4: List[Int] = List(3, 4, 5)

 */
}
