import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiFilter {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5, 10, 20, 15, 25);
        
        num.stream()
        .filter((n) -> n%2==0 && n!=10)
        .forEach(n -> System.out.println(n));

        // List<Integer> a = num.stream()
        //         .filter((n) -> n % 2 == 0 && n != 12)
        //         .collect(Collectors.toList());

        //         System.out.println(a);

        // Example 2
        List<Employee> employees = Arrays.asList(
            new Employee("shyam", 50000),
            new Employee("krish", 70000),
            new Employee("ayush", 60000)
        );

        List<Employee> filterSalary = employees.stream()
                                      .filter(emp -> emp.salary > 60000)
                                      .collect(Collectors.toList());
        
        filterSalary.forEach(emp -> System.out.println("Employee name : " +emp.name + " Salary : " + emp.salary));
    }
}

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name=" + name + ", salary=" + salary + "}";
    }
}

