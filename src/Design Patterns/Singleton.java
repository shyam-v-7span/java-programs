public class Singleton {
    public static void main(String[] args) {
        LazyInitialization l1 = LazyInitialization.getInstace();

        // LazyInitialization l2 = LazyInitialization.getInstace();
        // LazyInitialization l3 = LazyInitialization.getInstace();
        // LazyInitialization l4 = LazyInitialization.getInstace();

        EagerInitialization e1 = EagerInitialization.getInstance();
    }
}

class LazyInitialization{

    //create object only when needed or accessing first time

    private static LazyInitialization instance;

    private LazyInitialization(){}

    public static LazyInitialization getInstace(){
        if(instance == null){
            System.out.println("this time new object");
            instance = new LazyInitialization();
        }
        System.out.println("old object");
        return instance;
    }
}

class EagerInitialization{

    // create object when class is loaded
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){}

    public static EagerInitialization getInstance() {
        return instance;
    }
}
