import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class UniqueVisitor {
    LinkedHashMap<String, String> visitors = new LinkedHashMap<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       
    UniqueVisitor(){
        visitors.put("user1", LocalDateTime.now().format(formatter));
        visitors.put("user2", LocalDateTime.now().format(formatter));
        visitors.put("user3", LocalDateTime.now().format(formatter));
        visitors.put("user1", LocalDateTime.now().format(formatter));
        visitors.put("user4", LocalDateTime.now().format(formatter));
    }

    public void visit(String userId) {
         String time = LocalDateTime.now().format(formatter);
        // add user or update time
        visitors.put(userId, time);
    }

    // Method to display visitors in order
    public void showVisitors() {
        System.out.println("unique Visitor:");
        visitors.forEach((key, value) -> System.out.println("User "+key + " || Time "+value));

    }

    public static void main(String[] args) throws InterruptedException{
        UniqueVisitor tracker = new UniqueVisitor();

        Thread.sleep(2000);
        tracker.visit("user1");
        tracker.visit("user5");
        tracker.visit("user6");
        tracker.visit("user1");

        tracker.showVisitors();
    }
}
