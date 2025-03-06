package OOP.Polymorphism;

class OnlineShopping {
    
    // Order with only product name
    public void placeOrder(String productName) {
        System.out.println("Order placed: " + productName + " (Quantity: 1)");
    }

    // Order with product name and quantity
    public void placeOrder(String productName, int quantity) {
        System.out.println("Order placed: " + productName + " (Quantity: " + quantity + ")");
    }

    // Method 3: Order with product name, quantity, and discount code
    public void placeOrder(String productName, int quantity, String discountCode) {
        System.out.println("Order placed: " + productName + " (Quantity: " + quantity + ")");
        System.out.println("Applied Discount Code: " + discountCode);
    }
}

// Main class to test the method overloading
public class OverloadingExample {
    public static void main(String[] args) {
        OnlineShopping shopping = new OnlineShopping();

        // Placing orders using different overloaded methods
        shopping.placeOrder("Laptop");                        // Calls Method 1
        shopping.placeOrder("Smartphone", 2);                 // Calls Method 2
        shopping.placeOrder("Headphones", 3, "DISCOUNT10");   // Calls Method 3
    }
}
