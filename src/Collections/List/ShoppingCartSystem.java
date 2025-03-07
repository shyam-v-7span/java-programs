package Collections.List;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - " + price;
    }
}

// Shopping Cart Class
class ShoppingCart {
    private ArrayList<Product> cart = new ArrayList<>();

    // Add product to cart
    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product + " added to cart");
    }

    // Remove product from cart
    public void removeProduct(String productName) {
        for (Product product : cart) {
            if (product.name.equalsIgnoreCase(productName)) {
                cart.remove(product);
                System.out.println(productName + " is removed");
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }

    // View all products in the cart
    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty");
        } else {
            System.out.println("\nShopping Cart:");
            cart.forEach(product -> System.out.println(product));
        }
    }
}

// Main Class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Product\n2. Remove Product\n3. View Cart\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1->{
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    cart.addProduct(new Product(name, price));
                }
                case 2 ->{
                    System.out.print("Enter product name to remove: ");
                    String removeName = scanner.nextLine();
                    cart.removeProduct(removeName);
                }
                case 3 ->{
                    cart.viewCart();
                }
                
                case 4 ->{
                    System.out.println("Thank you ");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
