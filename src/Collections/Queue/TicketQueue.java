package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketQueue {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ticket Booking Queue");
            System.out.println("1. Add to queue");
            System.out.println("2. Next customer");
            System.out.println("3. show waiting Customers");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();
                    ticketQueue.offer(name); // Adds customer to the queue
                    System.out.println(name + " added to the ticket queue.");
                    break;

                case 2:
                    if (!ticketQueue.isEmpty()) {
                        System.out.println("Ticket give to " + ticketQueue.poll()); // Removes first customer
                    } else {
                        System.out.println("No customers in queue.");
                    }
                    break;

                case 3:
                    if (!ticketQueue.isEmpty()) {
                        System.out.println("\nWaiting Customers:");
                        ticketQueue.forEach(System.out::println);
                    } else {
                        System.out.println("No customers in queue.");
                    }
                    break;

                case 4:
                    System.out.println("Exit..");
                    return;

                default:
                    System.out.println("please valid choice");
            }
        }
    }
}

