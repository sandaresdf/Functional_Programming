package Tute5

import scala.io.StdIn.readInt
object Q03 {

  def sum(n: Int): Int = n match {
    case 1 => 1
    case _ =>  n + sum(n-1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    var n = readInt()
    println(sum(n))
  }

}
