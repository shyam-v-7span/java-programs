import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("Sparrow","Vulture","Dove","Eagle");
        Name name = new Name();
        //a.forEach(t -> System.out.println(t));

        a.forEach(System.out::print);

        //a.forEach(n -> name.Operation(n));
        a.forEach(name::Operation);
    }
}

class Name{

    Name(){
        System.out.println("constructer called");
    }
    void Operation(String s){
        if(s.length() <= 5){
            System.out.println(s.toUpperCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }
    }
}