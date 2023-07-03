package Tute3

object Q02 {

  def filterStrings(arr: Array[String]): Array[String] = {
    var newList: Array[String] = Array.empty[String]
    for (str <- arr) if (str.length > 5) newList = newList :+ str
    newList
  }

  def main(args: Array[String]): Unit = {
    val inputArr: Array[String] = Array("apple", "banana", "orange", "strawberry", "kiwi")
    val filteredArr = filterStrings(inputArr)
    println(filteredArr.mkString(", "))
  }

}







