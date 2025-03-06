package bank;

class BankAccount {

    private double balance;
    String branchName;
    protected double interestRate;
    public String accountHolder;

    // Constructor (Public)
    public BankAccount(String accountHolder, double balance, String branchName) {
        this.accountHolder = accountHolder;
        this.branchName = branchName;
        this.interestRate = 0.0; // Default interest rate (Will be set in subclass)
        this.balance = balance;
    }

    private void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount+" deposited");
            showBalance();
        } else {
            System.out.println("amount must positive");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("withdrawn: " + amount);
            showBalance();
        } else {
            System.out.println("insufficient balance");
        }
    }

    // Protected method to get interest rate (Accessible in subclasses)
    protected double getInterestRate() {
        return interestRate;
    }
}
