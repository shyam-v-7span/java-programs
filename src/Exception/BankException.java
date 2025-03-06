class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}

class Bank {
    private double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    public void transferFunds(String accountNumber, double amount) throws InsufficientBalanceException, InvalidAccountException {
        if (accountNumber.length() != 10) {
            throw new InvalidAccountException("invalid account number, must be 10 digits.");
        }
        
        if (amount > balance) {
            throw new InsufficientBalanceException("insufficient balance");
        }

        // Simulate fund transfer
        balance -= amount;
        System.out.println("transaction successful! current balance: " + balance);
    }
}

public class BankException {
    public static void main(String[] args) {
        Bank myAccount = new Bank(1000); // Initial balance = $1000

        try {
            myAccount.transferFunds("1234567890", 500); // Successful transaction
            myAccount.transferFunds("12345", 200); // Invalid account number
            myAccount.transferFunds("9876543210", 600); // Insufficient balance
        } catch (InsufficientBalanceException e) {
            System.out.println("error: " + e.getMessage());
        } catch (InvalidAccountException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("something went  wrong " + e.getMessage());
        } finally {
            System.out.println("Thank you for using service");
        }
    }
}