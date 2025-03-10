package Collections.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Library {
    Set<String> books = new HashSet<>(); // HashSet to store unique book titles

    // Add a book to the collection
    public void addBook(String bookName) {
        if (books.add(bookName)) {
            System.out.println(bookName + " added to the library");
        } else {
            System.out.println(bookName + " is already in the library");
        }
    }

    // Remove a book from the collection
    public void removeBook(String bookName) {
        if (books.remove(bookName)) {
            System.out.println(bookName + " removed from the library");
        } else {
            System.out.println(bookName + "' not found in the library");
        }
    }

    // Display all books in the library
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty");
        } else {
            System.out.println("\nLibrary Collection:");
            books.forEach(book -> System.out.println(book));
        }
    }
}

// Main Class
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n1. Add Book\n2. Remove Book\n3. Show Books\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book name: ");
                    String bookName = scanner.nextLine();
                    library.addBook(bookName);
                }
                case 2 -> {
                    System.out.print("Enter book name to remove: ");
                    String removeBook = scanner.nextLine();
                    library.removeBook(removeBook);
                }
                case 3 -> {
                    library.showBooks();
                }
                case 4 -> {
                    System.out.println("Library system closed");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
