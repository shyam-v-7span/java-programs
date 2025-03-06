import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        //Using Constructor Reference to Create Employee Objects
        Function<String, Employee> employee = name -> new Employee(name, 5000); // Default salary
        Employee emp1 = employee.apply("shyam");
        Employee emp2 = employee.apply("Ram");

        System.out.println("Employees created:");
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
