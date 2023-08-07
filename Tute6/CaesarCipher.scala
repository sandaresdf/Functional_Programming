package Tute6

object CaesarCipher {

  val n: Int = 23
  def addtoWord(x: Char): Char = x match {
    case ' ' => x
    case x if (x.isUpper) => ('A'.toInt + ((x + n)-'A'.toInt) % 26).toChar
    case x if (x.isLower) => ('a'.toInt + ((x + n)-'a'.toInt) % 26).toChar
  }

  def reduceWord(x: Char): Char = x match {
    case ' ' => x
    case x if (x.isUpper) => ('Z'.toInt + ((x - n) - 'Z'.toInt) % 26).toChar
    case x if (x.isLower) => ('z'.toInt + ((x - n) - 'z'.toInt) % 26).toChar
  }

  def encrypt(data: String): String = {
    if (data.length == 1)
      addtoWord(data.toCharArray.head).toString
    else {
      val (left, right) = data.splitAt(1)
      addtoWord(left.toCharArray.head) + encrypt(right)
    }
  }

  def decrypt(data: String): String = {
    if (data.length == 1)
      reduceWord(data.toCharArray.head).toString
    else {
      val (left, right) = data.splitAt(1)
      reduceWord(left.toCharArray.head) + decrypt(right)
    }
  }

  def cipher(str: String, func: String => String): String = {
    val pat = "^[a-zA-Z ]+$"
    if (str.matches(pat)) {
      func(str)
    } else {
      "Can only contain letters and spaces"
    }
  }

  def main(args: Array[String]): Unit = {
    "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
    var data: String = "The quick brown Fox Jumps over the lazy dog#"

    var enDt: String = cipher(data, encrypt)
    println("Encrypted data: " + enDt)
    println("Decrypted data: " + cipher(enDt, decrypt))
  }
}