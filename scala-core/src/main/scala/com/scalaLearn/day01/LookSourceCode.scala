package com.scalaLearn.day01

object LookSourceCode {
  def main(args: Array[String]): Unit = {

    // Ctrl + B 查看源码
    val array = new Array[Int](10)
    // 代码格式化快捷键 Ctrl + Alt + l
    for (item <- array) {
      println(item)
    }
  }
}
