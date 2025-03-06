import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", Salary: $" + salary;
    }
}

// Main Class
public class PredicateExample {
    public static void main(String[] args) {
        //create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("shyam", 5000),
            new Employee("patel", 7000),
            new Employee("xyz", 10000)
        );

        //define predicate for High Salary Employees
        Predicate<Employee> predicate = emp -> emp.salary> 6000;

        //filter employees Earning More Than 6000
        List<Employee> highEarners = employees.stream()
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println("employees earning more than 6000:");
        highEarners.forEach(System.out::println);
    }
}
