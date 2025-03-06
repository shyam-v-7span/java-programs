package OOP.Abstraction;

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // abstract method
    public abstract void processPayment();

    public void showPaymentDetails() {
        System.out.println("processing payment of: " + amount);
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        showPaymentDetails();
        System.out.println("payment done by credit card: " + cardNumber);
    }
}

class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        showPaymentDetails();
        System.out.println("payment done using UPI ID: " + upiId);
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(5000, "123456789");
        payment1.processPayment();

        System.out.println();

        Payment payment2 = new UPIPayment(2500, "user@upi");
        payment2.processPayment();
    }
}
