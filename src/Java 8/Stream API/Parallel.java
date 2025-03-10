import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Order {
    int orderId;
    String status;
    double amount;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = "pending";
    }

    public void validateOrder() {
        System.out.println("Validating : " + orderId + " on thread: " + Thread.currentThread().getName());
    }

    public void applyDiscount() {
        if (amount > 100) {
            amount *= 0.90; // 10% discount apply
            System.out.println("discount applied on : " + orderId);
        }
    }

    public void processOrder() {
        this.status = "processed";
        System.out.println("Order ID: " + orderId + " processed on thread: " + Thread.currentThread().getName());
    }
}

public class Parallel {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order(101, 100), 
            new Order(102, 90), 
            new Order(103, 200),
            new Order(104, 50), 
            new Order(105, 150), 
            new Order(106, 210)
        );

        //call methods and process paralley
        orders.parallelStream().forEach(Order::validateOrder);
        orders.parallelStream().forEach(Order::applyDiscount);
        orders.parallelStream().forEach(Order::processOrder);

        long orderCount = orders.parallelStream().count();
        double totalAmount = orders.parallelStream().collect(Collectors.summingDouble(p -> p.amount));

        System.out.println("total Orders : " + orderCount);
        System.out.println("total amount after discounts: " + totalAmount);
    }
}
