package Multithreading;

class ATM extends Thread {
    private String customerName;
    private double amount;

    public ATM(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println(customerName + " is trying to withdraw " + amount);
        try {
            Thread.sleep(3000); // take transaction time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(customerName + " successfully withdrawed " + amount);
    }
}

public class Withdraw {
    public static void main(String[] args) {
        ATM user1 = new ATM("shyam", 1000);
        ATM user2 = new ATM("Ram", 500);
        ATM user3 = new ATM("krishna", 700);

        // Starting threads
        user1.start();
        user2.start();
        user3.start();
    }
}
