
// Representa um banco que gerencia contas
import java.util.ArrayList;
import java.util.List;

public class Bank {
  private String name;
  private List<Account> accounts;

  public Bank(String name) {
    this.name = name;
    this.accounts = new ArrayList<>();
  }

  public void addAccount(Account account) {
    if (account != null) {
      accounts.add(account);
    }
  }

  public void listAccounts() {
    for (Account account : accounts) {
      System.out.println("Account Number: " + account.getNumber() + ", Owner: " + account.getOwner().getName()
          + ", Balance: " + account.getBalance());
    }
  }

  public String getName() {
    return name;
  }
}