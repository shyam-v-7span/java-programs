package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();


        //ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,20,30,40,50));
        
        // for add a element
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(20);
        a.add(10);
        a.add(50);
        
        // add multiple at one time
        Collections.addAll(a,10,20,30,40);

        //print by for each loop
        
        for (Integer i : a) {
            System.out.println(i);
        }

        System.out.println("get by index :"+a.get(2));
        
        Iterator<Integer> i = a.iterator();

        while (i.hasNext()) {
            System.err.println(i.next());
        }
        
    }
}
