package OOP.Inheritance;

class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Donkey extends Animal {
    void walk() {
        System.out.println("Donkey walks on 4 legs");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Donkey d1 = new Donkey();
        //access parent variable using child object 
        d1.name = "don";
        //access parent method using child object 
        d1.eat();
        d1.walk();
    }
}