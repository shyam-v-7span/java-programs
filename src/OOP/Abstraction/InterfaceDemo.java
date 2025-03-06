package OOP.Abstraction;

interface PaymentGateway {
    void processPayment(double amount); 
}

// class implementing paymen
class CreditCardPayment implements PaymentGateway {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
        System.out.println("Card Number: " + cardNumber);
    }
}

// class implementing payment
class UPIPayment implements PaymentGateway {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of " + amount);
        System.out.println("UPI ID: " + upiId);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        CreditCardPayment payment1 = new CreditCardPayment("12349012");
        payment1.processPayment(500.0);

        System.out.println();

        UPIPayment payment2 = new UPIPayment("user@upai");
        payment2.processPayment(250.0);
    }
}
