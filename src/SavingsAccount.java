public class SavingsAccount extends Account {
  public SavingsAccount(String number, Client owner) {
    super(number, owner);
  }

  // Método específico para a conta poupança que adiciona juros ao saldo
  public void addInterest(double interestRate) {
    if (interestRate > 0) {
      double interest = balance * interestRate / 100;
      balance += interest;
      System.out.println("Interest added. New balance: " + balance);
    } else {
      System.out.println("Invalid interest rate.");
    }
  }

  // Sobrescreve o método de transferência para adicionar restrições na conta
  // poupança
  @Override
  public void transfer(Account targetAccount, double amount) {
    if (!(targetAccount instanceof SavingsAccount)) {
      if (targetAccount != null && amount > 0 && balance >= amount) {
        this.withdraw(amount);
        targetAccount.deposit(amount);
        System.out.println("Savings account transfer successful to account: " + targetAccount.number);
      } else {
        System.out.println("Transfer failed. Check balance and account details.");
      }
    } else {
      System.out.println("Transfers between savings accounts are not allowed.");
    }
  }
}