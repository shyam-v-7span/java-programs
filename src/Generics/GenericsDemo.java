package Generics;

public class GenericsDemo {
    public static void main(String[] args) {
        Box<Double> b = new Box<>();
        b.setValue(10.0);
        System.out.println(b.getValue());

        Box<String> b2 = new Box<>();
        b2.setValue("shyam");
        System.out.println(b2.getValue());

    }
}

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}