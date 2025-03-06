package Multithreading;

class TicketBooking implements Runnable {
    public String passengerName;
    public int seatNumber;

    public TicketBooking(String passengerName, int seatNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
    }

    @Override
    public void run() {
        System.out.println(passengerName + " is booking seat number " + seatNumber);
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ticket booked for " + passengerName + " Seat: " + seatNumber );
    }
}

public class BookingSystem {
    public static void main(String[] args) {
        // Creating booking tasks
        TicketBooking booking1 = new TicketBooking("abc", 1);
        TicketBooking booking2 = new TicketBooking("shyam", 2);
        TicketBooking booking3 = new TicketBooking("xyz", 3);

        // Creating threads
        Thread t1 = new Thread(booking1);
        Thread t2 = new Thread(booking2);
        Thread t3 = new Thread(booking3);

        
        t1.start();
        t2.start();
        t3.start();
    }
}
