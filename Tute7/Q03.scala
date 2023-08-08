package Tute7

import scala.util.control.Breaks.break

object Q03 {
  val isPrime: Int => Boolean = n => {
    var res = true
    if (n < 2) {
      res = false
    }
    for (i <- 2 until n) {
      if (n % i == 0) {
        res = false
      }
    }
    res
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 49)
    val outputList = filterPrime(inputList)
    println(outputList)
  }

}