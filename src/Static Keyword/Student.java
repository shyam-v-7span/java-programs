class Student {
    int rollNo;
    String name;

    //static variables
    static String university = "abc university"; 
    static String universityCity = "Rajkot";
    static int TotalStudentsCapacity;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Rollno.: " + rollNo + ", Name: " + name + ", University: " + university +", City: "+universityCity);
    }

    // static method 
    static void changeUniversityCity(String universityCity){
        Student.universityCity = universityCity;
    }

    // execute before main method
    static {
        System.out.println("static block executed");
        TotalStudentsCapacity = 25;
        System.out.println("capacity : "+TotalStudentsCapacity);
    }
}


