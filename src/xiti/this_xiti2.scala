package xiti

object this_xiti2 {
  def main(args: Array[String]): Unit = {
    val student1 = new Student("张三", 20) // 使用主构造器，传入姓名和年龄
    student1.printInfo()
    val student2 = new Student("李四") // 使用辅助构造器1，只传入姓名
    student2.printInfo()
    val student3 = new Student(25) // 使用辅助构造器2，只传入年龄
    student3.printInfo()
    val student4 = new Student() // 使用辅助构造器3，不传入任何参数
    student4.printInfo()
  }

  class Student(val name: String, var age: Int) {
    // 主构造器，接收姓名和年龄参数，并将其赋值给类的字段
    println(s"创建了一个名为 $name 的学生，年龄为 $age 岁")

    // 辅助构造器1，接收姓名参数，年龄默认为0
    def this(name: String) {
      this(name, 0)
    }

    // 辅助构造器2，接收年龄参数，默认姓名为"Unknown"
    def this(age: Int) {
      this("Unknown", age)
    }

    // 辅助构造器3，没有接收任何参数，默认姓名为"Unknown"，年龄为0
    def this() {
      this("Unknown", 0)
    }

    def printInfo(): Unit = {
      println(s"姓名: $name, 年龄: $age")
    }
  }

}
