import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random rn = new Random();

        // generate number between 0 to 9
        int x = rn.nextInt(10);
        System.out.println(x);

        // generate number between 0 to 1
        double y = rn.nextDouble();
        System.out.println(y);

        
    }
}
