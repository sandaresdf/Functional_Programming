package Tute9

class BankAccount(accountNumber: String, initialBalance: Double) {
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

class Bank(account_list: List[BankAccount]) {
  var accounts: List[BankAccount] = account_list
  def accountsWithNegativeBalances: List[BankAccount] =
    account_list.filter(_.getBalance < 0)

  def calculateTotalBalance: Double =
    account_list.map(_.getBalance).sum

  def applyInterest(): Unit = {
    account_list.foreach(account => {
      if (account.getBalance > 0) {
        val interest = account.getBalance * 0.05
        account.deposit(interest)
      } else {
        val interest = account.getBalance * 0.1
        account.withdraw(interest)
      }
    })
  }
}

object Main extends App {
  val account1 = new BankAccount("A123", 100)
  val account2 = new BankAccount("B456", -200)
  val account3 = new BankAccount("C789", 500)

  val bank = new Bank(List(account1, account2, account3))

  println("Accounts with negative balances:")
  val accountsWithNegativeBalances = bank.accountsWithNegativeBalances
  accountsWithNegativeBalances.foreach(account => println(account.getBalance))

  val totalBalance = bank.calculateTotalBalance
  println(s"Total balance of all accounts: $totalBalance")

  println("Applying interest:")
  bank.applyInterest()
  bank.accounts.foreach(account => println(s"${account.getBalance}"))
}

