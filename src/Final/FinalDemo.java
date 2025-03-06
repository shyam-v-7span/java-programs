class Bank {
    final double interestRate = 5.5; // Fixed interest rate

    final public void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    
}

public class SavingsAccount extends Bank {
    // @Override
    // public void displayInterestRate(){
        
    // }

    // Error can not override final method
}

public class FinalDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        // bank interestRate = 6.0; // This will cause a compilation error

        bank.displayInterestRate();
    }
}
