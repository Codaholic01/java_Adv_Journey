 package OOPS.Encapulation.Practice;
 class BankAcc {
    // Private field: Hidden from outside the class
    private double balance;

    // Constructor to initialize the balance
    public BankAcc(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit money (controlled access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money (controlled access)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Public method to check balance (read-only access)
    public double getBalance() {
        return balance;
    }
}

