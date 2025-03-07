package Collections.Set;

import java.util.HashSet;
import java.util.Set;

//Defination : Find Duplicate Characters in a String

public class  SetProblem {

    public static void getDuplicates(String input) {

        Set<Character> words = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        System.out.print("duplicate character using hashSet: ");
        
        for (char c : input.toCharArray()) {
            if (!words.add(c)) {
                duplicate.add(c);
            }
        }

        System.out.println(duplicate);
    }

    public static void main(String[] args) {
        String input = "aabbcdeww";
        getDuplicates(input);
    }
}
