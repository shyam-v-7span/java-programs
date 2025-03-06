package bank;

class SavingsAccount extends BankAccount {
    
    public SavingsAccount(String accountHolder, double balance, String branchName, double rate) {
        super(accountHolder, balance, branchName);
        interestRate = rate; // set protected variable value
    }

    // show interest rate
    public void showInterestRate() {
        System.out.println("interest Rate for " + accountHolder + ": " + getInterestRate() + "%");
    }
}
