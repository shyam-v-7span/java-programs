package Generics;

class Pair<K, V> {
    public K key;
    public V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class GenericPairExample {
    public static void main(String[] args) {

        Pair<Integer, String> employee = new Pair<>(101, "shyam");
        System.out.println(employee.value);

        Pair<String, Double> product = new Pair<>("phone", 1200.0);
        System.out.println(product.value);

        Pair<String, Boolean> userStatus = new Pair<>("shyam", true);
        System.out.println(userStatus.value);
    }
}
