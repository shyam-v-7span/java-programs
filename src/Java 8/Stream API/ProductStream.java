import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    public String name;
    public double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    
}

public class ProductStream{
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200),
            new Product("Smartphone", 800),
            new Product("Tablet", 500),
            new Product("Smartwatch", 250),
            new Product("Laptop", 100)
        );

        // give top 3 expensive products
        List<Product> topProducts = products.stream()
                .sorted((p1, p2) -> Double.compare(p2.price, p1.price))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 Expensive Products:");
        topProducts.forEach(System.out::println);

        // give distinct products
        List<String> uniqueProducts = products.stream().map(p -> p.name)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique Products: " + uniqueProducts);

        // skip top 2 expensive products
        List<Product> remainingProducts = products.stream()
        .sorted((p1, p2) -> Double.compare(p2.price, p1.price))
        .skip(2) // Skip the top 2 expensive products
        .collect(Collectors.toList());

        System.out.println("3,4,5 expensive products ");
        remainingProducts.forEach(System.out::println);

    }
}
