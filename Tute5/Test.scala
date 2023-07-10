package Tute5

object Test {

  def primeSeq(n: Int): Unit = {
    def isPrime(k: Int, i: Int): Boolean = {
      if (k <= 2) k == 2
      else if (k % i == 0) false
      else if (i * i > k) true
      else isPrime(k, i + 1)
    }

    def printPrimes(k: Int): Unit = {
      if (k < n) {
        if (isPrime(k, 2))
          println(k)
        printPrimes(k + 1)
      }
    }

    printPrimes(2)
  }

  def main(args: Array[String]): Unit = {
    // Test the primeSeq function
    primeSeq(10)
  }


}
