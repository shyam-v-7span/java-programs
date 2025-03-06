package Collections.Map;

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
        System.out.println("student id 103:" + student.get(103));
        System.out.println("Contains ID 102? " + student.containsKey(102));
        System.out.println("Contains student Eve? " + student.containsValue("Eve"));

        student.put(103, "Chris");
        System.out.println("Updated HashMap: " + student);

        student.remove(104);
        System.out.println("after removing id 104: " + student);
        System.out.println("size of hashMap: " + student.size());
        System.out.println("hashmap empty? " + student.isEmpty());

        System.out.println("\nIterating over HashMap:");
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nIterating using forEach() method:");
        student.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("Keys: " + student.keySet());
        System.out.println("Values: " + student.values());

        student.replace(105, "Evelyn");
        System.out.println("After replacing ID 105's value: " + student);

        student.merge(102, "Robert", (oldVal, newVal) -> oldVal + " & " + newVal);
        System.out.println("After merging ID 102: " + student);

        boolean isRemoved = student.remove(101, "Alice");
        System.out.println("Was ID 101 removed? " + isRemoved);
        System.out.println("After conditional removal: " + student);

        student.clear();
        System.out.println("After clearing HashMap: " + student);
    }
}
