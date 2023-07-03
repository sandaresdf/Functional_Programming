package Tute3

object Q01 {

  def reverseString(str: String): String = {
    if (str.length == 1) {
      return str
    } else {
      val (left, right) = str.splitAt(1)
      return reverseString(right) + left
    }
  }

  def main(args: Array[String]): Unit = {
    val str = ""
    println(reverseString(str))
  }
}
