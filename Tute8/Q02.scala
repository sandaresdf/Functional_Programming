package Tute8

object Q02 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer input.")
    } else {
      val input = args(0).toInt

      val classifyNumber: Int => String = {
        case n if n <= 0 => "Negative/Zero"
        case n if n % 2 == 0 => "Even number"
        case n => "Odd number"
      }

      val result = classifyNumber(input)
      println(result)
    }
  }
}