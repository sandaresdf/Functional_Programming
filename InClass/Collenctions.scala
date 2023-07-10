package InClass

object Collenctions {

  var n:Array[Int] = new Array[Int](5)
  var marks = Array(34,86,90,78,50)

  def readA(i:Int): Array[Int] = {
    if (i<1) Array()
    else {
      println("Enter >")
      Array(scala.io.StdIn.readInt()) ++ readA(i - 1)
    }
  }

  def printA(x: Array[Int]): Any = {
    if (!x.isEmpty) {
      print(x.head + " ")
      printA(x.tail)
    }
  }

//  def maxA(x: Array[Int]): Any = {
//    if (x.length == 1) x.head
//    else {
//      var temp = maxA(x.tail)
//      if (x.head > temp) x.head
//      else temp
//    }
//  }
  def array_def(): Unit = {
    var marks = Array(34,86,90,78,50)
    println(marks(1))
  }

  def main(args: Array[String]): Unit = {
    array_def()
    println(printA(marks))
  }

}
