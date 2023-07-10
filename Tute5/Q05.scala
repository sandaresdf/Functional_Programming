package Tute5

import scala.io.StdIn.readInt

object Q05 {

  def isOdd(n: Int): Boolean = !(isEven(n))

  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }

  def evenSum(n: Int, sum: Int = 0): Int = (isEven(n)) match {
    case true => (n>0) match {
      case true => evenSum(n-2, sum + n)
      case _ => sum
    }
    case _ => evenSum(n-1, sum)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number: ")
    var x = readInt()
    println(evenSum(x-1))
  }

}
