package bank;

public class Main {
    public static void main(String[] args) {
        //BankAccount myAccount = new BankAccount("Shyam Patel", 1000, "Rajkot");

        SavingsAccount myAccount = new SavingsAccount("Shyam Patel", 1000, "Rajkot", 5.5);
        
        // Accessing public members
        System.out.println("Account Holder: " + myAccount.accountHolder);

        // accessing default
        System.out.println("Branch Name: " + myAccount.branchName);

        // Performing transactions
        myAccount.deposit(500);
        myAccount.withdraw(300);

        myAccount.showInterestRate();
        
    }
}
