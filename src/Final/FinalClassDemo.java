final class Transaction {
    void processPayment() {
        System.out.println("Processing secure payment...");
    }
}

// class FakeTransaction extends Transaction { } // This will give an error

public class FinalClassDemo {
    public static void main(String[] args) {
        Transaction txn = new Transaction();
        txn.processPayment();
    }
}
