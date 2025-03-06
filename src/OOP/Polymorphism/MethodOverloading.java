package OOP.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        a1.add(20, 15);
        a1.add(20, 15, 50);
        a1.add(50.0, 15.0);
    }
}

class Addition {
    public void add(int a, int b) {
        int Sum = a + b;
        System.out.println("Sum = " + Sum);
    }

    public void add(int a, int b, int c) {
        int Sum = a + b + c;
        System.out.println("Sum = " + Sum);
    }

    public void add(double a, double b) {
        double Sum = a + b;
        System.out.println("Double Sum = " + Sum);
    }
}