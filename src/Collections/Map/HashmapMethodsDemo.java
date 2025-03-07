import java.util.HashMap;
import java.util.Map;

public class HashmapMethodsDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();

        student.put(1, "shyam");
        student.put(2, "hello");
        student.put(3, "abc");
        student.put(4, "xyz");
        student.put(5, "john");

        System.out.println("HashMap: " + student);
        System.out.println("student id:" + student.get(3));
        System.out.println("Contains id " + student.containsKey(2));
        System.out.println("Contains student " + student.containsValue("shyam"));

        student.put(3, "Ram");
        System.out.println("updated: " + student);

        student.remove(104);
        System.out.println("after remove " + student);
        System.out.println("size : " + student.size());
        System.out.println("is empty? " + student.isEmpty());

        System.out.println("\nIterating over HashMap:");
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nIterating using forEach() method:");
        student.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("Keys: " + student.keySet());
        System.out.println("Values: " + student.values());

    }
}
