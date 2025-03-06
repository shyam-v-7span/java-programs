import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary = this.salary + (this.salary * (percentage / 100));
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
    
}

public class ExConsumer {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("shyam", 50000));
        employees.add(new Employee("xyz", 60000));
        employees.add(new Employee("abc", 7000));

        Consumer<Employee> Increament = emp -> emp.increaseSalary(10);

        Consumer<Employee> printEmp = emp -> System.out.println(emp.toString());

        employees.forEach(Increament.andThen(printEmp));
    }
}
