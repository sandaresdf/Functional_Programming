package InClass

object Tuple {

  def grade(i: Int): String = (i>=50) match {
    case true => "Pass"
    case false => "Fail"
  }
  def getStudent(): (String, Int, String) = {
    val name = scala.io.StdIn.readLine("Enter the name: ")
    print("Enter marks: ")
    val marks = scala.io.StdIn.readInt()
    (name, marks, grade(marks))
  }

  def main(args: Array[String]): Unit = {

  }

}
