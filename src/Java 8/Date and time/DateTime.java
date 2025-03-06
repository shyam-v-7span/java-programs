import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate d1 = LocalDate.of(2025, Month.MARCH, 5);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(d1);
        System.out.println(today);
        System.out.println(tomorrow);

        int n = today.compareTo(d1);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime l1 = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("time in sydney : " + l1);

        Instant instant = Instant.now();
        System.out.println(instant);

        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 30);

        Duration duration = Duration.between(start, end);
        //System.out.println("Duration: " + duration.toHours() + " hours " + duration.toMinutes() % 60 + " minutes");
        System.out.println("Duration : "  +duration.toHours() + " h "+ duration.toMinutes() % 60+ " m");
    }
}