package OOPS.AccessModifier;

public class AcceMain {
    // Main class

    public static void main(String[] args) {
        Account acc = new Account("12345", 50000, "Delhi", "ABC Bank");
        acc.showDetails();        // ✅ all within same class
        System.out.println("-------------------------");

        Customer c = new Customer("99887", 70000, "Mumbai", "XYZ Bank");
        c.displayCustomerAccess();
        System.out.println("-------------------------");

        //

}
    
}
