import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(10,20,30,4,8,8);

        //reduce method
        int sum = l1.stream().reduce(0,(a,b) -> a+b);
        System.out.println("sum using reduce = "+sum);
        
        // count 
        System.out.println("number of elements : "+l1.stream().count());

        // distinct elements
        List<Integer> dis = l1.stream().distinct().toList();
        System.out.println("distinct list = "+dis);

        List srt = l1.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list = "+srt);
    }
}
