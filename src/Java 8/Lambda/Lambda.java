interface Add{
    void number(int n1,int n2);
}

public class Lambda {
    public static void main(String[] args) {
        
        // Add calc = new Add() {
        //     public void number(int n1,int n2){
        //         System.out.println(n1 * n2);
        //     }
        // };

        //Add calc = (int n1,int n2) ->{ System.out.println(n1 * n2);};

        // by lambda expression
        Add calc = (n1,n2) -> System.out.println(n1 * n2);

        calc.number(10, 20);
    }
}
