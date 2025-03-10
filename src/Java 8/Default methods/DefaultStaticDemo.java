interface Animal{
    default void run(){
        System.out.println("animal is running");
    }

    static void walk(){
        System.out.println("animal is walking");
    }
}

public class DefaultStaticDemo {
    public static void main(String[] args) {
        Animal animal = new Animal() {}; //anonymous class

        animal.run();
        Animal.walk(); //static method called 
    }
}
