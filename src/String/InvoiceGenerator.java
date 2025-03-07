import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InvoiceGenerator {
    public static void main(String[] args) {
        // Customer and Order Details
        String customerName = "shyam patel";
        String orderId = "as123";
        LocalDate orderDate = LocalDate.now();

        // items
        String[][] items = {
            {"Laptop", "1", "800"},
            {"Mouse", "2", "25"},
            {"phone", "1", "50000"}
        };

        StringBuilder invoice = new StringBuilder();

        invoice.append("Invoice\n");
        System.out.println();
        invoice.append("customer: ").append(customerName).append("\n");
        invoice.append("Order id: ").append(orderId).append("\n");
        invoice.append("Date: ").append(orderDate).append("\n");
        System.out.println();
        invoice.append("Item\t\tQty\tPrice\n");
        System.out.println();

        double totalAmount = 0;

        // Add items to the invoice
        for (String[] item : items) {
            String itemName = item[0];
            int quantity = Integer.parseInt(item[1]);
            double price = Double.parseDouble(item[2]);

            double totalItemPrice = quantity * price;
            totalAmount += totalItemPrice;

            invoice.append(itemName).append("\t\t").append(quantity).append("\t").append(totalItemPrice).append("\n");
        }

        System.out.println();
        invoice.append("Total amount:\t\t").append(totalAmount).append("\n");
        System.out.println();
        invoice.append("Thank you \n");

        // Print the generated invoice
        System.out.println(invoice.toString());
    }
}
