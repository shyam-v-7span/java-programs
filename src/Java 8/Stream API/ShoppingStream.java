import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Order Class
class Order {
    public int orderId;
    public String status;
    public double price;

    public Order(int orderId, String status, double price) {
        this.orderId = orderId;
        this.status = status;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Status: " + status + ", Price: " + price;
    }
}

// Main Class
public class ShoppingStream {
    public static void main(String[] args) {
        // List of customer orders
        List<Order> orders = Arrays.asList(
            new Order(101, "Delivered", 250),
            new Order(102, "Pending", 150),
            new Order(103, "Delivered", 400),
            new Order(104, "Cancelled", 50),
            new Order(105, "Delivered", 100)
        );

        // filter delivered orders
        List<Order> deliveredOrders = orders.stream()
                .filter(order -> order.status.equalsIgnoreCase("Delivered"))
                .collect(Collectors.toList());
        System.out.println(" Delivered orders:");
        deliveredOrders.forEach(System.out::println);

        // Sort orders by price (Descending)
        List<Order> sortedOrders = orders.stream()
                .sorted((o1, o2) -> Double.compare(o2.price, o1.price))
                .collect(Collectors.toList());
        System.out.println("\n Orders Sorted by Price");
        sortedOrders.forEach(System.out::println);

        //calculate total revenue from delivered orders
        double totalRevenue = orders.stream()
                .filter(order -> order.status.equalsIgnoreCase("Delivered"))
                .mapToDouble(p -> p.price)
                .sum();
        System.out.println("\nTotal revenue from delivered orders: " + totalRevenue);
   
        boolean allAbove100 = orders.stream().allMatch(p -> p.price > 100);
        System.out.println("all products above 100 ?" + allAbove100);
   
    }
}
