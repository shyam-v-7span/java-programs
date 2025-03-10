import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary); // Sort by salary (ascending)
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

   
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Shyam", 50000),
            new Employee(102, "Om", 60000),
            new Employee(103, "Ram", 55000)
        );

        Collections.sort(employees); 
        employees.forEach(System.out::println);
    }
}
