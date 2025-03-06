interface Payment {
    void pay(int amt);
}

class CreditCard implements Payment {
    public void pay(int amt) {
        System.out.println(amt + " Rs. paid by credit card");
    }
}

class DebitCard implements Payment {
    public void pay(int amt) {
        System.out.println(amt + " Rs. paid by debit card");
    }
}

class Cart {
    private Payment payment;

    public Cart(Payment payment) {
        this.payment = payment;
    }

    public void checkout(int amt) {
        payment.pay(amt);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        Cart cart1 = new Cart(new CreditCard());
        cart1.checkout(1000);

        Cart cart2 = new Cart(new DebitCard());
        cart2.checkout(2000);
    }
}
