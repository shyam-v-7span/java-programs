import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Employee1 {
    String name;
    double salary;

    public Employee1() {
        this.name = "Default Employee";
        this.salary = 50000;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class ExSupplier {
    public static void main(String[] args) {
       
        Supplier<Employee1> employeeSupplier = Employee1::new;

        Employee1 emp = employeeSupplier.get();
        System.out.println(emp);

        List<Employee1> employees = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            employees.add(employeeSupplier.get());
        }

        employees.forEach(System.out::println);

    }
}
