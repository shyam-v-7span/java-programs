package Multithreading;

// runnable interface
public class Demothreading {
    public static void main(String[] args) {

        Runnable a = new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable b = new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}