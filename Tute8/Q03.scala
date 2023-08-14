package Tute8

object Q03 {
  val toUpper: String => String = input => input.toUpperCase
  val toLower: String => String = input => input.toLowerCase
  val toUpperGivenIndex: (String, Int) => String = (input, index) => input.updated(index, input.charAt(index).toUpper)

  val formatNames:(String => String, String) => String = (formatFunction, name) => formatFunction(name)
  val formatNamesWithIndex: ((String, Int) => String, String, Int) => String = (formatFunction, name, index) => formatFunction(name, index)

  def main(args: Array[String]): Unit = {
      println(formatNames(toUpper, "Benny"))
      println(formatNamesWithIndex(toUpperGivenIndex, "Niroshan", 1))
      println(formatNames(toLower, "Saman"))
      println(formatNamesWithIndex(toUpperGivenIndex, "Kumara", 5))
  }
}