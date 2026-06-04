package Deitel.ChapterIII.Account;

public class Account {
    private String name;
    private double balance;


    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }

    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }

    }

    public void withdraw (double withdrawAmount) {

        if (withdrawAmount > balance) {
            System.out.println("Operation not allowed");
        } else {
            this.balance -= withdrawAmount;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccount(Account acc) {
        System.out.println("Name: " + acc.name);
        System.out.println("Balance: " + acc.balance);
    }


}
