package Tute10

object Q02 {

  def countLetterOccurrences(words: List[String]): Int = {
    var lengths = words.map(_.length)
    var occurrences = lengths.reduce((a, b) => a + b)
    occurrences
  }

  def main(args: Array[String]): Unit = {

    val words = List("apple", "banana", "cherry", "date")
    val occurrences = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $occurrences")
  }

}
