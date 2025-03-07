package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Myset s  = new Myset();
        s.print();
        Myset2 s2 = new Myset2();
        s2.print();
    }
}

class Myset{
    HashSet<Integer> h = new HashSet<Integer>();
    Myset(){
        // add element in Hashset
        h.add(20);
        h.add(10);
        h.add(24);
        h.add(1);
        h.add(2);
        h.add(14);
    }
    void print(){
        System.out.print("hashset is : ");
        for (Integer i : h) {
            System.out.print(i+",");
        }
    }
}

class Myset2{
    Set<Integer> h = new TreeSet<Integer>();
    Myset2(){
        // add element in treeset
        h.add(20);
        h.add(10);
        h.add(24);
        h.add(1);
        h.add(2);
        h.add(14);
    
    }
    void print(){
        System.out.print("\ntreeset is : ");
        for (Integer i : h) {
            System.out.print(i+",");
        }
    }
    
}