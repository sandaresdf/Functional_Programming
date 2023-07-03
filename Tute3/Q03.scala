package Tute3

object Q03 {

  def getMean(num1: Int, num2: Int): Float = "%.2f".format((num1.toFloat + num2.toFloat) / 2.0f).toFloat

  def main(args: Array[String]): Unit = {
    val num1: Int = 100;
    val num2: Int = 70;

    println(getMean(num1, num2));

  }
}