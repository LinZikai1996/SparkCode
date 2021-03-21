package com.scalaLearn.day01

object VarDemo {
  def main(args: Array[String]): Unit = {

    val age : Int = 10
    val salary : Double = 10.9
    val name : String = "Tom"
    val isPass: Boolean = true
    // 在scala中，小数默认为 Double，整数默认为 Int
    val score :Float = 70.9f

    println(s"name: $name, age: $age, salary: $salary, isPass: $isPass, score: $score")


    val number = 10
    //方式1: 可以使用idea方式来证明
    println(number)
    //方式2: 使用isInstanceOf[Int]来证明
    println(number.isInstanceOf[Int])


    val dog  = new Dog
    dog.age = 10
    dog.name = "花花"
    println(dog)

    //  Scala中一个方法没有形参，可以省略括号
    println(number.toString + " \t" + number.toDouble)

    println(sayHello)
  }
  //Nothing作为返回值，明确说明该方法没有正常返回值
  def sayHello: Nothing = {
    throw new Exception("抛出异常")
  }
}

class Dog{
  // 声明age，给一个默认值
  var age: Int = 0
  var name: String = ""
}