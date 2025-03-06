public class PetrolCar extends Car {
    String categoryOfCar;

    // Constructor
    public PetrolCar(String brand,String model, String categoryOfCar) {

        super(brand, model); // call parent class constructor
        super.speed = 200; // accesing parent variable 
        this.categoryOfCar = categoryOfCar;
        System.out.println("child class constructor called");
    }

    // Overriding displayInfo method
    @Override
    void displayInfo() {
        super.displayInfo(); // call parent class method

        System.out.println("it is petrol " + categoryOfCar + " and top speed = "+ speed);

        
    }
}
