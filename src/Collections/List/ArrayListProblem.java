package Collections.List;//Find All Pairs with a Given Sum

import java.util.*;

public class ArrayListProblem {
    public static void findPairs(ArrayList<Integer> list, int sum) {
        HashSet<Integer> set = new HashSet<>();
        
        System.out.println("Pairs with sum " + sum + ":");
        
        for (int num : list) {
            int complement = sum - num; 

            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            
            set.add(num);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,2, 7, 4, 5, 1, 3, 6, 8));
        int sum = 9;
        
        findPairs(list, sum);
    }
}
