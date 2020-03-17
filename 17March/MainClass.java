
package bank;



public class MainClass {

  

    public static void main(String[] args) {
      BankAccount bank = new BankAccount();
        BankAccount bank2 = new BankAccount("Jack", 2);
        BankAccount bank3 = new BankAccount("Tom", 3, 2300, true);
        BankAccount bank4 = new BankAccount();
      bank.deposit(2000);
       // System.out.println(bank.getTransactions());
        bank2.withdraw(2000);
        // System.out.println(bank2.getTransactions());
         
         bank2.deposit(5000);
         bank2.withdraw(3000);
        // System.out.println(bank2.getTransactions());
         bank2.deposit(240);
         // System.out.println(bank2.getTransactions());
          bank3.deposit(67000);
          bank3.withdraw(230);
          bank3.deposit(3400);
          bank3.withdraw(40000);
          bank.deposit(6700);
          
          
          
          bank4.deposit(6000);
          bank4.withdraw(3400);
          System.out.println(bank.getTransactions());
          System.out.println(bank2.getTransactions());
          System.out.println(bank3.getTransactions());
           System.out.println(bank4.getTransactions());
          System.out.println(BankAccount.accountsOpened());
          
    }

}
