package bank;

import java.util.ArrayList;

public class BankAccount {

    private int number;
    private double amount;
    private String name;
    private boolean active;
    private ArrayList<String> transactions 
    
    private static int accountsOpened;
    
    
    public BankAccount(){
        accountsOpened++;
        transactions.add("Account created");
        this.transactions== new ArrayList();
    }
    
    public BankAccount(String name,int number ){
        accountsOpened++;
        transactions.add("Account created");
        this.name=name;
        this.number=number;
    }
    
    public BankAccount(String name ,int number ,double amount, boolean active){
        accountsOpened++;
        transactions.add("Account created");
        this.name=name;       
        this.number=number;
        this.amount=amount;
        this.active=active;   
    }
    
    
    

    public void setNumber(int number) {
        number = this.number;
    }

    public int getNumber() {
        return number;
    }

    public void setAmount(double amount) {
        amount = this.amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setName(String name) {
        name = this.name;
    }

    public String getName() {
        return name;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        active = this.active;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void deposit(int amount) {       
        this.amount += amount;
        transactions.add("Deposit: " +amount);
    }

    public void withdraw(int amount) {
        if (this.amount - amount <= 0)
        {
        System.out.println("You don't have any money to withdraw.");
        }else {
            this.amount-=amount;
            transactions.add("Withdraw: "+ amount);
            }
    }
    public static int accountsOpened(){
        return accountsOpened;
    }

    
    
    
}
