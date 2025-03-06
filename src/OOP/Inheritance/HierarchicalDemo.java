package OOP.Inheritance;

class BankAccount {
    public String accountHolder;

    public void showAccount() {
        System.out.println("account holder: " + accountHolder);
    }
}

// subclass 1
class SavingsAccount extends BankAccount {
    
    public void showInterestRate() {
        System.out.println(accountHolder + "'s account interest rate is 5%");
    }
}

// subclass 2
class CurrentAccount extends BankAccount {
    public void withdraw() {
        System.out.println(accountHolder + " withdraw money from current account");
    }
}

public class HierarchicalDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.accountHolder = "shyam";
        savings.showAccount();
        savings.showInterestRate();

        System.out.println();

        CurrentAccount current = new CurrentAccount();
        current.accountHolder = "Shyam incorporation";
        current.showAccount();
        current.withdraw();
    }
}
