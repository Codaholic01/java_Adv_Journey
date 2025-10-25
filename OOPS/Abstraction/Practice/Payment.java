package OOPS.Abstraction.Practice;

    // Abstract class
abstract class Payment {
    abstract void validateDetails();
    abstract void pay(double amount);

    void paymentMessage() {
        System.out.println("Processing your payment securely...");
    }
}

// Concrete class 1
class CreditCardPayment extends Payment {
    void validateDetails() {
        System.out.println("Validating credit card details...");
    }

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

// Concrete class 2
class UPIPayment extends Payment {
    void validateDetails() {
        System.out.println("Validating UPI ID...");
    }

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

// Concrete class 3
class NetBankingPayment extends Payment {
    void validateDetails() {
        System.out.println("Validating bank account and IFSC...");
    }

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using NetBanking.");
    }
}




