package Tute7

object Q02 {

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(numbers => numbers * numbers)
  }
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = calculateSquare(inputList)
    println(outputList) // Output: List(2, 4, 6, 8, 10)
  }
}
