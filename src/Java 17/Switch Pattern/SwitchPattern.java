public class SwitchPattern {
    public static void main(String[] args) {
        String day = null;

        switch (day) {
            case null -> System.out.println("null value arrive");
            case "Sunday","Saturday" -> System.out.println("woke up at 9am");
            case "Monday" -> System.out.println("woke up at 7am");
            default -> System.out.println("woke up at 8am");
        }

        
    }
}
