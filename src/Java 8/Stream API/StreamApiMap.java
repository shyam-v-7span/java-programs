import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMap {
    public static void main(String[] args) {
        List<Employee> l1 = Arrays.asList(
            new Employee(21, "Shyam"),
            new Employee(22, "utsav"),
            new Employee(23, "ayush")
            );
        
        //we can print this way
        //l1.stream().map(emp-> emp.name).forEach(emp -> System.out.println(emp));

        //2nd  way
        //List<String> nameList = l1.stream().map(emp -> emp.name).toList();
        //System.out.println(nameList);

        // print by using collector
        List<String> nameList = l1.stream().map(emp -> emp.name).collect(Collectors.toList());
        System.out.println(nameList);

        // example 2

        List<Integer> l2  = Arrays.asList(10,20,15,13,25,7,1);
        l2.stream().map(n-> n*2).forEach(n -> System.out.print(n+","));

        List<Integer> l3 = l2.stream().map(n -> n*2).collect(Collectors.toList());
        System.out.println(l3);
    }   
}

class Employee{
    int age;
    String name;

    Employee(int age, String name){
        this.name = name;
        this.age = age;
    }
}