package Tute4

import scala.io.StdIn.readInt

object Q02 {

  def patternMatching(number: Int): Unit = number match {
    case x if x < 0 => println("Negetive Number")
    case x if x == 0 => println("Zero")
    case x if x % 2 == 0 => println("Even Number")
    case _ => println("Odd Number")
  }

  def main(args: Array[String]): Unit =
    if (args.length == 0) println("There are no arguments")
    else patternMatching(args(0).toInt)
}
