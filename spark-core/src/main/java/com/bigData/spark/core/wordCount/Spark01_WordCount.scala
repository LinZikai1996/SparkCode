package com.bigData.spark.core.wordCount

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark01_WordCount {
  def main(args: Array[String]): Unit = {

    // toDO 建立和Spark的连接
    val sparkConf = new SparkConf().setMaster("local").setAppName("WordCount")
    val sparkConnection = new SparkContext(sparkConf)

    // toDO 执行业务操作

    // 1. 读取文件，获取一行一行的数据
    val line: RDD[String] = sparkConnection.textFile("data")
    // 2. 将一行数据进行拆分，形成一个一个单词
    val words: RDD[String] = line.flatMap(_.split(" "))
    // 3. 将数据根据单词进行分组，便于统计
    val wordGroup: RDD[(String, Iterable[String])] = words.groupBy(word => word)
    // 4. 分组后数据进行转化
    val wordToCount = wordGroup.map{
      case (word, list) =>
        (word, list.size)
    }
    // 5. 控制台输出
    val array: Array[(String, Int)] = wordToCount.collect()
    array.foreach(println)

    // toDO 关闭连接
    sparkConnection.stop()
  }
}
