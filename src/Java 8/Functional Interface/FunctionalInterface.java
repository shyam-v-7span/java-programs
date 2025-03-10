interface Calculator{
    public void num(int n1 , int n2);
}

//by external class
class Add implements Calculator{
    public void num(int n1,int n2){
        System.out.println("sum = "+ (n1+n2));
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {

        Add add = new Add();
        add.num(10, 50);

        // anonymous class
        Calculator calc = new Calculator()
        {
            public void num(int n1,int n2){
                System.out.println("multiplication = "+n1 * n2);
            }
        };
        calc.num(15,20);
    }
}
