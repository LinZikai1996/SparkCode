package com.scalaLearn.day01

// 1. object 表示为一个伴生对象，简单理解为对象
// 2. HelloScala就是类名，底层对应的是HelloScala$
// 3. 当我们编写一个object (HelloScala)，底层生成两个.class 文件，分别是 HelloScala.class 和 HelloScala$.class
// 4. Scala在运行时，过程如下：
//    (1) 先从 HelloScala.class 的 main 开始
//    (2) 调用 HelloScala$.class 的 main 方法
//    (3) 执行代码
// 5. 认识：
//    (1) object HelloScala 对应是一个 HelloScala$ 静态对象 MODULE$
//    (2) 是一个单例
object HelloScala {
  // 1. def 表示一个方法
  // 2. main 表示方法名
  // 3. args: Array[String] 表示形参，scala特点将参数名写前面，类型写后面
  // 4. Array[String] 表示数组类型
  // 5. Unit = 表示返回值为空(void)
  def main(args: Array[String]): Unit = {
    // 输出
    println("Hello Scala")
  }
}
