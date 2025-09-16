abstract class BankAccount {
    int accountNumber;
    String holderName;
    double balance;
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if(balance >= amount) balance -= amount;
    }
    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    double calculateInterest() {
        return balance * 0.02;
    }
}

public class main4 {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(101, "Alice", 10000);
        BankAccount a2 = new CurrentAccount(102, "Bob", 20000);
        System.out.println("Savings Interest: " + a1.calculateInterest());
        System.out.println("Current Interest: " + a2.calculateInterest());
    }
}