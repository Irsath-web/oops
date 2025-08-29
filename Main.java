// BankAccount.java
class BankAccount {
    // Member variables
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to display account details
    void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check balance
    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
// Main.java
public class Main {
    public static void main(String[] args) {
        // Create BankAccount object
        BankAccount myAccount = new BankAccount("John Doe", "ACC123456", 1000.0);

        // Display initial details
        myAccount.displayAccountInfo();

        // Perform some operations
        System.out.println("\n--- Transactions ---");
        myAccount.deposit(500.0);
        myAccount.withdraw(300.0);
        myAccount.withdraw(1500.0); // Try to withdraw more than balance
        myAccount.checkBalance();
    }
}

