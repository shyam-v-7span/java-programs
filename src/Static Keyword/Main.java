public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "shyam");
        Student s2 = new Student(2, "Ram");

        s1.display();
        s2.display();

        //call static variable
        Student.university = "marwadi university";
        // call static method
        Student.changeUniversityCity("Junagadh");

        System.out.println("new data:");
        s1.display();
        s2.display();
    }
}