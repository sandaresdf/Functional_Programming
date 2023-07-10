package InClass

object Recursion {

  def fac(n: Int): Int = n match {
    case 1 => n
    case _ => n + fac(n-1)
  }

  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1) + fib(n-2)
  }

  def main(args: Array[String]): Unit = {
    println(fac(4))
    println(fib(4))
  }

}
