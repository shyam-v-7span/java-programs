import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass2 {
    public static void main(String[] args) {
        //Optional<Person> o1 = Optional.ofNullable(null);
        Optional<Person> o1 = Optional.ofNullable(new Person("shyam"));

        String s = o1.map(Person::getName).get();
        System.out.println(s);

    }
}

class Person{
    private String name;

    public String getName(){
        return name;
    }

    Person(String name){
        this.name = name;
    }
}
