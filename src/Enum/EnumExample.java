//Order Status
enum OrderStatus {
    PLACED, SHIPPED, DELIVERED, CANCELLED;
}

class Order {
    public int orderId;
    public OrderStatus status; // Enum Type

    public Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", status=" + status + "]";
    }

}

public class EnumExample {
    public static void main(String[] args) {
        //create orders with different statuses
        Order order1 = new Order(101, OrderStatus.PLACED);
        Order order2 = new Order(102, OrderStatus.SHIPPED);
        Order order3 = new Order(103, OrderStatus.DELIVERED);

        System.out.println("Order details:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        //update order status
        order1.updateStatus(OrderStatus.SHIPPED);
        order2.updateStatus(OrderStatus.DELIVERED);
        System.out.println();
        System.out.println(order1);
        System.out.println(order2);
    }
}
