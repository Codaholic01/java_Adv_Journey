package OOPS.Encapulation.Practice;

// Testing the class
public class BankaccMain {
    public static void main(String[] args) {
        BankAcc account = new BankAcc(1000.0); // Start with $1000
        account.deposit(500.0);  // Output: Deposited: $500
        account.withdraw(200.0); // Output: Withdrew: $200
        System.out.println("Current Balance: $" + account.getBalance()); // Output: Current Balance: $1300.0

        // Can't directly access balance like: account.balance = -100; (it's private!)
    }
}
