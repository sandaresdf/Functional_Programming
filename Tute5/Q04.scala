package Tute5

import scala.io.StdIn.readInt
object Q04 {

  def isOdd(n: Int): Boolean = !(isEven(n))
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number: ")
    var x = readInt()
    if (isEven(x)) println("Even Number")
    else println("Odd Number")
  }
}
