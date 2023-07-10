package Tute5

import scala.io.StdIn.readInt
object Q01 {

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case x => GCD(x, a % x)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p) => true
    case x if GCD(p, x) > 1 => false
    case x => prime(p, x + 1)
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number: ")
    var num = readInt()
    if (prime(num)) println("True")
    else println("false")
  }

}
