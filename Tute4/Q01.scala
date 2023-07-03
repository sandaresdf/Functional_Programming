package Tute4

import scala.io.StdIn.readDouble

object Q01 {

  var interest1: Double = 0.02
  var interest2: Double = 0.04
  var interest3: Double = 0.035
  var interest4: Double = 0.065

  def calcInterest(deposit: Double): Double = deposit match {
    case x if x <= 20000 => x * interest1
    case x if x <= 200000 => x * interest2
    case x if x <= 2000000 => x * interest3
    case x if x > 2000000 => x * interest4
  }

  def main(args: Array[String]): Unit = {
    print("Enter the deposit value: ")
    val input: Double = readDouble()
    println("Interest for year is: " + calcInterest(input))
  }

}
