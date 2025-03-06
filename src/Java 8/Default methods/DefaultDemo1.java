interface Vehicle{

    void start();
    // default method has body
    default void stop(){
        System.out.println("Vehicle did stop");
    }
    
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("car started");
    }

    // we can override default method also

    @Override
    public void stop() {
        Vehicle.super.stop(); // call stop() of interface
        System.out.println("car stopped");
    }

    
}

public class DefaultDemo1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

    }
}