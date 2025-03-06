package OOP.Inheritance;

class Animal {
    void eat() {
        System.out.println("animal eats food");
    }
}

class Mammal extends Animal {
    void run() {
        System.out.println("Mammals can run");
    }
}

class Dog extends Mammal {
    String name;

    void bark() {
        System.out.println("Dog barks");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        // inherited from Animal
        d1.eat();
        // inherited from Mammal
        d1.run();
        //inherited from Dog
        d1.bark();
    }
}
