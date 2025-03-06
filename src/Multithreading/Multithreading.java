package Multithreading;

public class Multithreading{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.setPriority(Thread.MAX_PRIORITY);
        b.start();
    }
}

class A extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello"); 
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");   
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }
}
