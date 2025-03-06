package Constructor;

class Student {
    String name;
    int age;

    // default constructor
    public Student() {
        this.name = "Ram";
        this.age = 20;
        System.out.println("default constructor called");
    }

    // parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("parameterized constructor called");
    }

    // opy constructor
    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        System.out.println("copy constructor called");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        //default constructor called
        Student s1 = new Student();
        s1.display();
        
        //parameterized constructor called 
        Student s2 = new Student("shyam", 21);
        s2.display();
        
        //copy constructor called
        Student s3 = new Student(s2);
        s3.display();
    }
}
