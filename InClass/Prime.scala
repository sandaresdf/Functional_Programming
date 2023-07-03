package InClass

object Prime {

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x>a => GCD(x, a)
    case x => GCD(x, a%x)
  }

  def prime(p: Int, n: Int=2): Boolean = n match {
    case x if (x==p) => true
    case x if GCD(p, x) > 1 => false
    case x => prime(p, x+1)
  }

  def power(x: Int, y:Int): Int = y match {
    case 0 => 1
    case _ => x * power(x, y-1)
  }

  def line(x: Int): Unit = {
    if (x>=1) {
      printf("%d", x)
      line(x-1)
    }
  }
  def pattern(x: Int): Unit = {
    if(x > 1) pattern(x-1)
    line((x))
    printf("\n")
  }

  def main(args: Array[String]): Unit = {
    // println(GCD(15, 10))

//    line(4)
     pattern(4)
  }
}
