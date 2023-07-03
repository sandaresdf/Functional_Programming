package InClass

object maximum {

  def max(x:Int, y:Int): Int = if (x>y) x else y

  def max2(x:Int, y:Int): Int = x >= y match {
    case true => x
    case false => y
  }

  def isEven(x:Int): Boolean = x%2 match {
    case 0 => true
    case _ => false
  }

  def main(args: Array[String]): Unit = {
    println(max2(5,6))
    println(isEven(2))
  }

}
