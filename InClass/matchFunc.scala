package InClass

object matchFunc {

  def leapYear(n: Int): Boolean = (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0) match {
    case true => true
    case false => false
  }

  def sign(x: Int): Int = x match {
    case x if x>0 => 1
    case x if x==0 => 0
    case x if x<0 => -1
  }

  def studentResult(marks: Double): String = marks match {
    case x if x >= 75 => "A"
    case x if x >= 65 => "C"
    case x if x >= 50 => "Pass"
    case _ => "F"
  }

  def interestCalc(deposit: Double): Double = deposit match {
    case x if x < 1000 => x * 0.05
    case x if x < 10000 => x * 0.06
    case x if x < 100000 => x * 0.07
    case x if x >= 100000 => x * 0.08
  }

  def main(args: Array[String]): Unit = {
  println(studentResult(45))
    println((interestCalc(900)))
  }

}
