// This is my BankAccount class for my Java project.
// It shows how to use static, this, final, and instanceof.

public class BankAccount {

    // --- STATIC members ---
    // A static variable is shared by all objects of the class.
    // It's like a single piece of information for the whole class.
    // Our bank name will be the same for every account.
    static String bankName = "State Bank of India";

    // This static variable will count how many accounts we have created.
    private static int totalAccounts = 0;


    // --- INSTANCE members ---
    // These belong to each individual object (each account).
    // The account holder's name.
    String accountHolderName;

    // A final variable cannot be changed once it is assigned.
    // This is perfect for an account number, which should never change.
    final int accountNumber;

    // The current balance of the account.
    private double balance;


    // --- CONSTRUCTOR ---
    // The constructor is called when we create a new BankAccount object.
    public BankAccount(String accountHolderName, int accountNumber) {
        // Here, 'this.accountHolderName' refers to the INSTANCE variable,
        // and 'accountHolderName' refers to the PARAMETER passed to the constructor.
        // The 'this' keyword helps us avoid confusion when names are the same.
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        // Initialize the balance to zero for a new account.
        this.balance = 0.0;

        // Every time a new account is created, we increase the total count.
        totalAccounts++;
        System.out.println("New account created for " + this.accountHolderName + "!");
    }


    // --- METHODS ---

    // A static method belongs to the class itself, not to any single object.
    // We can call it using the class name, like BankAccount.getTotalAccounts().
    public static void displayTotalAccounts() {
        System.out.println("------------------------------------");
        System.out.println("Total number of accounts in " + bankName + ": " + totalAccounts);
        System.out.println("------------------------------------");
    }

    // Method to deposit money.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed. Either amount is invalid or not enough balance.");
        }
    }

    // Method to display the details of a specific account.
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Bank Name: " + bankName); // Accessing static variable
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: $" + this.balance);
        System.out.println("-----------------------");
    }


    // --- MAIN method for testing ---
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Management System!");

        // Display total accounts before creating any.
        BankAccount.displayTotalAccounts();

        // Create two new bank accounts.
        BankAccount account1 = new BankAccount("Ravi Kumar", 1001);
        BankAccount account2 = new BankAccount("Sunita Sharma", 1002);

        // Now check the total number of accounts again.
        BankAccount.displayTotalAccounts();

        // Let's perform some transactions on account1.
        account1.deposit(5000.0);
        account1.withdraw(1500.0);

        // The 'instanceof' operator checks if an object is an instance of a specific class.
        // This is useful to make sure we have the right type of object before using it.
        System.out.println("\nChecking object type before displaying details...");
        if (account1 instanceof BankAccount) {
            System.out.println("Object 'account1' is a valid BankAccount. Displaying details.");
            account1.displayAccountDetails();
        } else {
            System.out.println("Object 'account1' is not a BankAccount.");
        }
        
        if (account2 instanceof BankAccount) {
            System.out.println("Object 'account2' is a valid BankAccount. Displaying details.");
            account2.displayAccountDetails();
        } else {
            System.out.println("Object 'account2' is not a BankAccount.");
        }

        // Trying to change the final accountNumber will cause a compile error.
        // For example, this line would not work:
        // account1.accountNumber = 2005; // Uncommenting this will show an error.
        System.out.println("\nDemonstrating the 'final' keyword. The account number " + account1.accountNumber + " cannot be changed.");
    }
}