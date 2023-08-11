package scala_basic

object Map_lianxi {
  def main(args: Array[String]): Unit = {
val info=Map("name"->"Xiaozhou","sex"->"男","age"->"19","h"->"ohh")
    // 指定打印输出键"name"对应的值
    val nameValue = info("name")//    println(info("name"))
    println("Name: " + nameValue)//   printf("我的名字是"+info("name"))

    // 指定打印输出键"sex"对应的值
    val schoolValue = info("sex")
    println("sex: " + schoolValue)

    // 指定打印输出键"age"对应的值
    val ageValue = info("age")
    println("Age: " + ageValue)

      val ohh= if(info.contains("hh"))info("hh")else 0
      println(ohh)//if (info.contains("hh")) 是用来检查映射 info 是否包含键为 "hh" 的键值对。这行代码使用了条件判断语句 if，根据 if 后面的条件来决定执行哪个分支。

  }
}
/*
映射(Map)  是一系列键值对的容器  在一个映射中 键是唯一但值不唯一 可以根据键对值进行快速检索
和集合一样 scala采用类继承机制提供了可变和不可变的两种版本的映射，分别定义在scala.collection.immutable和scala.collection.mutable
默认情况下 scala中使用不可变的映射   如果想使用可变映射 必须明确的导入scala.collection.mutable.Map

如果要获取映射中的值 可以通过键来获取  println(university("name"))
对于这种访问方式 如果给定的键不存在 则会抛出异常 为此 访问前可以先调用contains方法确定键是否存在
  val Name= if(university.contains("name"))university("name")else 0
      println(Name)
##
检查 university 这个映射（类似字典）中是否包含键（key）为 "name" 的键值对。
如果映射中有键 "name"，则把它对应的值赋给变量 Name。
如果映射中没有键 "name"，则将变量 Name 的值设为 0。
##
val info = Map("hh" -> "Hello", "world" -> "World")
if (info.contains("hh")) {
  println("键 'hh' 存在，值为: " + info("hh"))
} else {
  println("键 'hh' 不存在")
}
####
如果映射 info 中包含键 "hh"，那么条件表达式 info.contains("hh") 的结果就是真（true），执行 if 后面的代码块；如果映射中不包含键 "hh"，条件表达式的结果就是假（false），则跳过 if 后面的代码块，不执行其中的代码。
####
      不可变映射 是无法更新映射中的元素的 也无法增加新的元素 如果要更新映射元素 就需要定义一个可变的映射
      import scala.collection.mutable.Map
      val student_info=Map("student_name"->"Xiaozhou","school"->"Hunan Vocational College of Science and Technology","age"->"18","student_id","225102050")
        student_info("student_name")="zhou yan ye"//更新已有元素的值
        student_info("age")="19"//更新已有元素的值

        student_info("hobby")="listen music"//添加元素
        student_info+=("hh"->"oh yeah")//添加一个新元素
        student_info+=("oh"->"h_h","uu","o_o")//同时添加两个新元素

 */