interface Car {
    void startEngine();
}

class PetrolCar implements Car {
    public void startEngine() {
        System.out.println("Starting petrol car");
    }
}

class DieselCar {
    void startDieselEngine() {
        System.out.println("Starting diesel car");
    }
}

class CarAdapter implements Car {
    private DieselCar dieselCar;

    public CarAdapter(DieselCar dieselCar) {
        this.dieselCar = dieselCar;
    }

    public void startEngine() {
        System.out.println("using adapter");
        dieselCar.startDieselEngine();
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        
        Car petrolCar = new PetrolCar();
        petrolCar.startEngine();

        DieselCar dieselCar = new DieselCar();
        Car CarAdapter = new CarAdapter(dieselCar);
        CarAdapter.startEngine();
    }
}