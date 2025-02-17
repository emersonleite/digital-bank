public class Main {
  public static void main(String[] args) {
    // Criando clientes
    Client client1 = new Client("João Silva", "123456789");
    Client client2 = new Client("Maria Oliveira", "987654321");

    // Criando contas
    Account checkingAccount = new CheckingAccount("001", client1);
    Account savingsAccount = new SavingsAccount("002", client2);
    Account commonAccount = new CommonAccount("003", client1);

    // Criando banco e adicionando as contas
    Bank bank = new Bank("Banco XYZ");
    bank.addAccount(checkingAccount);
    bank.addAccount(savingsAccount);
    bank.addAccount(commonAccount);

    // Operações com as contas
    checkingAccount.deposit(1000.0);
    savingsAccount.deposit(500.0);
    commonAccount.deposit(200.0);

    checkingAccount.withdraw(200.0);
    commonAccount.withdraw(100.0);

    // Transferência de uma conta para outra
    checkingAccount.transfer(savingsAccount, 300.0);
    savingsAccount.transfer(checkingAccount, 200.0);

    // Listando as contas e seus saldos
    bank.listAccounts();
  }
}
