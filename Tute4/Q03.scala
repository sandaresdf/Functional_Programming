package Tute4

object Q03 {

  def toUpper(str: String): String = str.toUpperCase()

  def toLower(str: String): String = str.toLowerCase()

  def isValid(str: String, index: Int): Boolean = str match {
    case x if (x.isEmpty) => false
    case x if x.charAt(index) == ' ' => false
    case _ => true
  }

  def toUpperIndex(str: String, index: Int): String = isValid(str, index) match {
    case true => str.updated(index, (str.charAt(index).toUpper))
    case false => "Invalid Index"
  }

  def formatNames(formatFunc: String => String, name: String): String = formatFunc(name)

  def formatNames(formatFunc: (String, Int) => String, name: String, index: Int): String = formatFunc(name, index)

  def main(args: Array[String]): Unit = {
    println(formatNames(toUpper, "Benny"))
    println(formatNames(toUpperIndex, "Niroshan", 1))
    println(formatNames(toLower, "Saman"))
    println(formatNames(toUpperIndex, "Kumara", 5))
  }
}
