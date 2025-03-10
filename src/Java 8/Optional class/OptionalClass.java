import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> check = Optional.of("hello");
        System.out.println(check.get());

        Optional<String> o1 = Optional.empty();
        Optional<String> o2 = Optional.ofNullable(null);

        System.out.println(o1.orElse("abcdjdsjdhsdj"));;
        System.out.println(o1.isPresent()); 

        System.out.println(o2.isPresent()); 
        System.out.println(o2);

    }
}
