package OOP.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("shyam");
        System.out.println("name : " + p.getName());
    }
}

class Person {
    private String name;

    // getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}
