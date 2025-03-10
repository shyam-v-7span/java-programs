package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;

// defination remove duplicate of arraylist using hashset

public class RemoveDuplicateByHashSet {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        HashSet<Integer> set = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(set);

        System.out.println("new list is :" + numbers);
    }
}
