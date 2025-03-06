package Generics;

class Storage<T> {
    private T data;

    public void store(T data) {
        this.data = data;
        System.out.println("Data Stored: " + data);
    }

    public T retrieve() {
        return data;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // Storing an int
        Storage<Integer> intData = new Storage<>();
        intData.store(100);
        System.out.println(intData.retrieve());

        // Storing a string
        Storage<String> stringData = new Storage<>();
        stringData.store("Hello Generics");
        System.out.println(stringData.retrieve());

        //Storing a double
        Storage<Double> doubleData = new Storage<>();
        doubleData.store(99.99);
        System.out.println(doubleData.retrieve());
    }
}
