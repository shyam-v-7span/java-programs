import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Registration
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim().toLowerCase();

        if (username.isEmpty()) {
            System.out.println("please enter username");
            return;
        }

        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();

        // Email Validation
        if (!email.contains("@") && !email.contains(".")) {
            System.out.println("Invalid email");
            return;
        }

        System.out.print("set password: ");
        String password = scanner.nextLine();

        if (password.length() != 8) {
            System.out.println("please enter 8 character password");
        }
        System.out.println("\nRegistration successfully\n");

        // User Login
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine().trim().toLowerCase();

        if (enteredUsername.isEmpty()) {
            System.out.println("please enter username");
            return;
        }

        System.out.print("Enter Password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.isEmpty()) {
            System.out.println("please enter password");
            return;
        }

        // Username & Password Validation
        if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
            System.out.println();
            System.out.println("Login successful");
        } else {
            System.out.println("Incorrect username or password");
        }

        scanner.close();
    }
}
