package OOP.Polymorphism;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Donkey extends Animal {
    @Override
    void eat() {
        System.out.println("Donkey eats grass");
    }
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats other animals");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        Donkey d1 = new Donkey();
        d1.eat();
    }
}