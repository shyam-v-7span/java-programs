import java.util.Arrays;
import java.util.List;

class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Instance Method to print employee details
    public void displayEmployee() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

// Main Class
public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("shyam", 5000),
            new Employee("abc", 7000),
            new Employee("ram", 6000),
            new Employee("xyz", 8000)
        );

        //print employee details
        System.out.println("employee list:");
        employees.forEach(Employee::displayEmployee); // Instance method reference

        //Sort employees by salary
        employees.sort(MethodReferenceExample::compareBySalary);
        System.out.println("\n employees sorted by salary:");
        employees.forEach(System.out::println);

        //calculate Total Salary Paid
        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("\ntotal salary payout: $" + totalSalary);
    }

    // Static Method
    public static int compareBySalary(Employee e1, Employee e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}
