package xiti

object object_xiti {
  def main(args: Array[String]): Unit = {
    val student1 = new Student("xiao ming", 18, 91.5)
    val student2 = new Student("xiao hong", 17, 81.5)
    val student3 = new Student("xiao li", 19, 71.5)

    student1.printInfo()
    student2.printInfo()
    student3.printInfo()
  }

  class Student(val name: String, age: Int, source: Double) {
    def printInfo(): Unit = {
      printf("姓名: %s, 年龄: %d, 成绩: %.1f%n", name, age, source) //成绩保留一位小数
      // 使用 s 字符串插值来格式化输出信息
      // println(s"姓名: $name, 年龄: $age, 成绩: $source")

    }
  }

}
