import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface SalaryIncrement {
    double increment(double salary);
}

class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void applyIncrement(SalaryIncrement increment) {
        this.salary = increment.increment(this.salary);
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", Salary: $" + salary;
    }
}

public class LambdaExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("shyam", 5000),
                new Employee("ayush", 7000),
                new Employee("krish", 10000));

        // by using lambda
        SalaryIncrement increment = salary -> salary * 1.10;

        // without lambda
        SalaryIncrement increment2 = new SalaryIncrement() {
            public double increment(double salary) {
                return salary * 1.10;
            };
        };

        employees.forEach(emp -> emp.applyIncrement(increment));

        System.out.println("\nupdated employee salaries:");
        employees.forEach(System.out::println);
    }
}
