package xiti

object this_xiti {
  def main(args: Array[String]): Unit = {
    val test1 = new Couter("Counter1", 1, 2) // 创建一个 Couter 对象，设置名称、模式和步长
    val test2 = new Couter("Counter2", 2) // 创建一个 Couter 对象，设置名称和模式，步长默认为 1
    test1.info() // 显示计数器信息
    test1.increment() // 使用默认步长增加计数器的值
    printf("Value= %d \n", test1.current) // 显示当前计数器的值
    test2.info()
    test2.increment(3) // 设置步长为 3，增加计数器的值
    printf("Value= %d \n", test2.current)
    test1.reset() // 重置计数器的值
    printf("Value= %d \n", test1.current)
  }

  class Couter(val name: String, val mode: Int, var step: Int) {
    private var value = 0 // 存储计数器初始值
    def this(name: String, mode: Int) { // 第一个辅助构造器，默认步长为 1
      this(name, mode, 1)
    }

    def increment(step: Int = 1): Unit = {
      value += step
    }

    def current(): Int = {
      value
    }

    def info(): Unit = {
      printf("name: %s \t mode: %d \t step: %d \n", name, mode, step)
    }

    def reset(): Unit = {
      value = 0
    }
  }

}
