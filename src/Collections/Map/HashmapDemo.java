package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapDemo {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<>();

        student.put(1, "shyam");
        student.put(2, "xyz");
        student.put(3, "abc");
        student.put(4, "hello");
        student.put(5, "john");
        student.put(6, "utsav");
        
        System.out.println(student);

        // search student
        int searchId = 1;
        if (student.containsKey(searchId)) {
            System.out.println("student found : " + student.get(searchId));
        } else {
            System.out.println("student id not found.");
        } 
        
        // remove student
        int removeId = 2;
        if (student.containsKey(removeId)) {
            student.remove(removeId);
            System.out.println("student id " + removeId + " removed successfully.");
        } else {
            System.out.println("student id not found.");
        }

        // add student
        int AddId = 2;
        String name = "shyam";
    
        if (student.containsKey(AddId)) {
            System.out.println("already exist student");
        }
        else{
            student.put(AddId, name);
            System.out.println("student added sucessfully");
        }

        // get all students
        System.out.println("All Students:");
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
    }
}
