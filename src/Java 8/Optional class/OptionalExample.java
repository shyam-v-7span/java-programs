import java.util.Optional;

class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Optional<Double> getSalary() {
        return Optional.ofNullable(salary);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

public class OptionalExample {
    public static void main(String[] args) {
        Employee emp = new Employee("shyam", null);
        Employee emp2 = new Employee(null, null);

        Double updateSal = emp.getSalary().map(sal -> sal * 1.10).orElse(30000.0);       

        System.out.println("Updated Salary: " + updateSal);

        System.out.println("Employee 1 Name: " + emp.getName().orElse("no name given"));
        System.out.println("Employee 2 Name: " + emp2.getName().orElse("no name given"));
    }
}
