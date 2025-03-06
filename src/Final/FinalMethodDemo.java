class Employee {
    final double baseSalary = 50000;

    final void calculateSalary() { // Prevent overriding
        System.out.println("Final Salary: $" + baseSalary);
    }
}

class Manager extends Employee {
    // Cannot override calculateSalary() because it is final
    //@Override
    // void calculateSalary() { ... } 
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.calculateSalary();
    }
}
