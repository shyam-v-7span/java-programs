package Collections.Map;

import java.util.concurrent.ConcurrentHashMap;

class Bank {
    ConcurrentHashMap<String, Double> accounts = new ConcurrentHashMap<>();

    public void createAccount(String accountNumber, double balance) {
        accounts.putIfAbsent(accountNumber, balance);
        System.out.println("Account Created: " + accountNumber + " , Balance: " + balance);
    }

    public void deposit(String accountNumber, double amount) {
        accounts.computeIfPresent(accountNumber, (key, balance) -> {
            System.out.println("deposit " + amount + " into Account: " + key);
            return balance + amount;
        });
    }

    public void withdraw(String accountNumber, double amount) {
        accounts.computeIfPresent(accountNumber, (key, balance) -> {
            if (balance >= amount) {
                System.out.println(" Withdraw " + amount + " from account: " + key);
                return balance - amount;
            } else {
                System.out.println(" insufficient funds in account: " + key);
                return balance;
            }
        });
    }

    public void checkBalance(String accountNumber) {
        System.out.println("account: " + accountNumber + " , balance: " + accounts.get(accountNumber));
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createAccount("123", 5000);
        bank.createAccount("456", 7000);

        Thread t1 = new Thread(() -> {
            bank.deposit("123", 1000);
            bank.withdraw("123", 2000);
            bank.checkBalance("123");
        });

        Thread t2 = new Thread(() -> {
            bank.withdraw("456", 500);
            bank.deposit("456", 200);
            bank.checkBalance("456");
        });

        // Start Threads
        t1.start();
        t2.start();
    }
}
