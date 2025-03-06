public class Car {
    String brand;
    String model;

    int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("parent constructor called");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

