interface Payment {
    default void validatePayment() {
        System.out.println("validate the payment details");
    }

    static void customerCare(){
        System.out.println("customer care no : 1234567890");
    }

    void processPayment(double amount);
}

class CardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        validatePayment();
        System.out.println("payment by card = " + amount);
        Payment.customerCare();
    }

}

class OnlinePayment implements Payment {
    @Override
    public void processPayment(double amount) {
        validatePayment();
        System.out.println("payment by online = "+ amount);
        Payment.customerCare();
    }
}

public class PaymentExample {
    public static void main(String[] args) {
        Payment cardPayment = new CardPayment();
        cardPayment.processPayment(100.0);

        Payment onlinePayment = new OnlinePayment();
        onlinePayment.processPayment(50.0);
    }
}
