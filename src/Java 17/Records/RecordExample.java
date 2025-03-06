record Employee(String name, String department, double salary) {}

public class RecordExample {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("shyam", "it", 7000);
        Employee emp2 = new Employee("abc", "hr", 5000);

        System.out.println(emp1);
        System.out.println(emp2);

        System.out.println(emp1.name() + " works in " + emp1.department() + " department");
    }
}
