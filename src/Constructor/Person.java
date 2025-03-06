package Constructor;// constructor chaining

class Person {
    String name;
    int age;

    // default constructor
    public Person() {
        this("shyam");  // call the constructor with one parameter
        System.out.println("Default constructor called");
    }

    // constructor with one parameter
    public Person(String name) {
        this(name, 18); // call the constructor with two parameters
        System.out.println("One-parameter constructor called");
    }

    // constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two-parameter constructor called");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();  // calls default -> one-parameter -> two-parameter constructor
        p1.display();
    }
}
