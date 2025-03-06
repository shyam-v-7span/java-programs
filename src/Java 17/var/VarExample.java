import java.util.List;

public class VarExample {
    public static void main(String[] args) {

        var employees = List.of("Shyam", "Ayush", "Rohit");

        for (var employee : employees) {
            System.out.println("Employee: " + employee);
        }

        var filteredEmployees = employees.stream()
                .filter(name -> name.startsWith("S"))
                .toList();

        System.out.println("\n Employee name start with S: " + filteredEmployees);
    }
}
