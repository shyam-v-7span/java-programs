package OOP.Encapsulation;

class BankAccount {
    private String accountHolderName;
    private double balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter method 
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw: " + amount);
        } else {
            System.out.println("insufficient balance or invalid amount.");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolderName("shyam patel");
        
        System.out.println("Account holder: " + account.getAccountHolderName());
        System.out.println("balance: " + account.getBalance());

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("current balance: " + account.getBalance());
    }
}
