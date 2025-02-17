public abstract class Account implements AccountOperations {
  protected String number;
  protected double balance;
  protected Client owner;

  public Account(String number, Client owner) {
    this.number = number;
    this.owner = owner;
    this.balance = 0.0;
  }

  // Sobrescreve o método da interface para implementar o depósito
  @Override
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit successful. New balance: " + balance);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  // Sobrescreve o método da interface para implementar o saque
  @Override
  public void withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
      balance -= amount;
      System.out.println("Withdrawal successful. New balance: " + balance);
    } else {
      System.out.println("Insufficient funds or invalid amount.");
    }
  }

  // Sobrescreve o método da interface para implementar a transferência
  @Override
  public void transfer(Account targetAccount, double amount) {
    if (targetAccount != null && amount > 0 && balance >= amount) {
      this.withdraw(amount);
      targetAccount.deposit(amount);
      System.out.println("Transfer successful to account: " + targetAccount.number);
    } else {
      System.out.println("Transfer failed. Check balance and account details.");
    }
  }

  public double getBalance() {
    return balance;
  }

  public String getNumber() {
    return number;
  }

  public Client getOwner() {
    return owner;
  }
}
