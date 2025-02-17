public interface AccountOperations {
  void deposit(double amount);

  void withdraw(double amount);

  void transfer(Account targetAccount, double amount);
}
