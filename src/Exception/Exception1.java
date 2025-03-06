public class Exception1 {
    public static void main(String[] args) {
        int i = 13, n = 0;
        
        try {
            n = 12/i;
            if (n == 0) {
                throw new ArithmeticException("0 not allowed");
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("cannot divide by 0 "+e);
        }
        catch(Exception e){
            System.out.println("something went wrong"+e);
        }
        
        System.out.println(n); 
    }
}
