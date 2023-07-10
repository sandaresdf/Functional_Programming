package Tute5

import scala.io.StdIn.readInt

object Q02 {

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case x => GCD(x, a % x)
  }

  def isPrime(n: Int, i: Int = 2): Boolean = {

    if (n <= 2)
      if (n == 2) true
      else false
    if (n % i == 0) return false;
    if (i * i > n) return true;

    return isPrime(n, i + 1);
  }

  def primeSeq(n: Int): Unit = if (n > 0) {
    primeSeq(n - 1)
    if (isPrime(n)) print(n + " ")
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number: ")
    var x = readInt()
    primeSeq(x-1)
  }
}
