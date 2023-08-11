package scala_basic

object function_lianxi {
  def addInt(a: Int,b:Int):Int= {  //addInt是方法  因为它定义在 object function_lianxi 内。方法是定义在类、对象或特质中的可执行代码块。
    var sum: Int = 0
    sum = a + b
    return sum
  }
  def main(args: Array[String]): Unit = {
    print(addInt(4,5))
    //方法转函数的语法是在方法名称加上 "_" 符号 方法转换函数后 可以将其赋值给变量  以函数形式调用
    //将addInt转换成函数     val add =addInt _
    //使用函数进行调用           print(add(4,5))
  }
}




  /*
 方法
 没有使用实例的对象调用格式
  functionName (参数列表)
  方法由实例 的对象来第哦啊有可以用类似java的格式 可以使用类似java的格式(使用"."号)
  [instance.]functionName(参数列表)

  函数
  函数定义使用 val 关键字，后面跟着函数的名称、参数列表、返回类型和函数体。函数体使用 => 符号连接参数列表和函数体。
    val   functionName =([参数列表]) => function body
    val addInt=(a:Int,b:Int)=> a+b

   方法转换成函数
   val f1= m _

  */


/*
scala中 和java一样用用方法和函数  scala的方法是类的一部分 而函数是一个对象可以赋值给一个变量
在类中定义的函数即是方法
#方法的定义格式

方法可以有参数和返回值，可以使用各种类型的访问修饰符（如public, private等），也可以使用其他修饰符（abstract, final, static等）。
方法必须定义在类或特质（trait）中，通过类的实例（对象）来调用。
#
 def 方法名 ([参数列表]) : [返回类型] = {
   function body //方法体
   return [expr]//表达式 用于返回值
 }
#函数的定义方式

函数是一种特殊的值，它可以赋值给变量、作为参数传递给其他函数或方法，也可以作为返回值。Scala中的函数是一等公民，也就是说函数本身就是一种数据类型。
函数定义使用 val 关键字，后面跟着函数的名称、参数列表、返回类型和函数体。函数体使用 => 符号连接参数列表和函数体。
函数定义可以省略参数类型，Scala会根据上下文自动推断参数类型。
#
val function([参数列表]):[return type]={
    function body
    return [expr]
    }
 */