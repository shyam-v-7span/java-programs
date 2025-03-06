package Collections.Set;

import java.util.TreeSet;

// find missing value in 1 to n range.

public class TreeSetProblem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8};
        int n = 8;
        
        TreeSet<Integer> numbersSet = new TreeSet<>();

        for (int num : arr) {
            numbersSet.add(num);
        }

        System.out.print("Missing Numbers: ");
        for (int i = 1; i <= n; i++) {
            if (!numbersSet.contains(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
