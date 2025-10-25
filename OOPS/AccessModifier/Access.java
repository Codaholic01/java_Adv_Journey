package OOPS.AccessModifier;

    // File: AccessModifierExample.java

class Account {
    private String accountNumber;    // private → only inside this class
    double balance;                  // default → within same package
    protected String branchName;     // protected → within package + subclass
    public String bankName;          // public → accessible from anywhere

    // Constructor
    public Account(String accNo, double bal, String branch, String bank) {
        accountNumber = accNo;
        balance = bal;
        branchName = branch;
        bankName = bank;
    }

    // Private method (only within class)
    private void showAccountNumber() {
        System.out.println("Account Number: " + accountNumber);
    }

    // Default method
    void showBalance() {
        System.out.println("Balance: ₹" + balance);
    }

    // Protected method
    protected void showBranch() {
        System.out.println("Branch: " + branchName);
    }

    // Public method
    public void showBankName() {
        System.out.println("Bank: " + bankName);
    }

    // Method to show all accessible data inside class
    public void showDetails() {
        System.out.println("---- Account Details ----");
        showAccountNumber();  // ✅ private (inside same class)
        showBalance();        // ✅ default
        showBranch();         // ✅ protected
        showBankName();       // ✅ public
    }
}

// Subclass in same package
class Customer extends Account {
    public Customer(String accNo, double bal, String branch, String bank) {
        super(accNo, bal, branch, bank);
    }

    void displayCustomerAccess() {
        // showAccountNumber(); ❌ private — not accessible
        showBalance();       // ✅ default — same package
        showBranch();        // ✅ protected — same package
        showBankName();      // ✅ public — everywhere
    }
}


