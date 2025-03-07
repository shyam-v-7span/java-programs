import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        fullName = fullName.trim();
        
        String[] splitName = fullName.split(" ");
        
        for (int i = 0; i < splitName.length; i++) {
            System.out.println(splitName[i]);
        }

        String firstName = splitName[0];
        String lastName = splitName.length > 1 ? splitName[splitName.length - 1] : "not found";
        
        int charCount = fullName.replace(" ", "").length();
        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Total Characters " + charCount);
    }
}
