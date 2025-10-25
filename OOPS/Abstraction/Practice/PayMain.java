package OOPS.Abstraction.Practice;

public class PayMain {
    // Main class

    public static void main(String[] args) {
        Payment payment;  // reference of abstract class

        payment = new CreditCardPayment();
        payment.paymentMessage();
        payment.validateDetails();
        payment.pay(2500);

        System.out.println("---------------------------");

        payment = new UPIPayment();
        payment.paymentMessage();
        payment.validateDetails();
        payment.pay(1800);

        System.out.println("---------------------------");

        payment = new NetBankingPayment();
        payment.paymentMessage();
        payment.validateDetails();
        payment.pay(3200);
    }
}
    

