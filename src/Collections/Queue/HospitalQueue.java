import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    String name;
    int priority; 

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Patient [name=" + name + ", priority=" + priority + "]";
    }
}

public class HospitalQueue {
    public static void main(String[] args) {
        // Using comparator to sort by priority
        PriorityQueue<Patient> hospitalQueue = new PriorityQueue<>(Comparator.comparingInt(p -> p.priority));

        // less priority means high priority
        hospitalQueue.add(new Patient("Shyam", 2));  
        hospitalQueue.add(new Patient("abc", 5));    
        hospitalQueue.add(new Patient("Ram", 1)); 
        hospitalQueue.add(new Patient("don", 3)); 

        while (!hospitalQueue.isEmpty()) {
            System.out.println("operate : " + hospitalQueue.poll());
        }

    }
}
