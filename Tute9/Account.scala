package Tute9

class Account(accountNumber: String, initialBalance: Double)
{
  var accNo: String = accountNumber;
  private var balance: Double = initialBalance
  def getBalance: Double = balance
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $amount. New balance: $balance")
    } else {
      println("Invalid deposit amount")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $amount. New balance: $balance")
    } else {
      println("Invalid withdrawal amount")
    }
  }

  def transfer(amount: Double, targetAccount: Account): Unit = {
    if (amount > 0 && amount <= balance) {
      withdraw(amount)
      targetAccount.deposit(amount)
      println(s"Transferred $amount from $accountNumber to ${targetAccount.accNo}")
    } else {
      println("Invalid transfer amount")
    }
  }
}

object AccountObj extends App {
  val account1 = new Account("A123", 1000)
  val account2 = new Account("B456", 500)

  println("Initial balances:")
  println(s"Account 1: ${account1.getBalance}")
  println(s"Account 2: ${account2.getBalance}")

  account1.deposit(200)
  account2.withdraw(100)
  account1.transfer(300, account2)

  println("Final balances:")
  println(s"Account 1: ${account1.getBalance}")
  println(s"Account 2: ${account2.getBalance}")
}

