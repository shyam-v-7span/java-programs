import java.util.*;

class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName(){return name;}
    public double getSalary(){return salary;}

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("shyam", 50000),
                new Employee("abc", 75000),
                new Employee("krish", 50000),
                new Employee("ram", 90000),
                new Employee("man", 75000)
        );
        // sort by salary then Name
        Comparator<Employee> employeeComparator = Comparator
                .comparingDouble(Employee::getSalary).reversed()  // sort by salary 
                .thenComparing(Employee::getName);// if same salary, sort by name

        employees.sort(employeeComparator);

        System.out.println("Employees:");
        employees.forEach(System.out::println);
    }
}
