sealed class Employee permits Manager, Intern {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}

final class Manager extends Employee { // "final" prevents further subclassing
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Salary: " + salary);
    }
}

non-sealed class Intern extends Employee { // non-sealed allows subclassing
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void showDetails() {
        System.out.println("Intern: " + name + ", Stipend: " + salary);
    }
}

public class SealedClassExample {
    public static void main(String[] args) {
        Employee manager = new Manager("ram", 8000);
        Employee intern = new Intern("shyam", 0);

        manager.showDetails();
        intern.showDetails();
    }
}
