interface Book {
    String getDescription();
    double cost();
}

class SimpleBook implements Book {
    public String getDescription() { 
        return "it is a book"; 
    }
    public double cost() { 
        return 50.0; 
    }
}

class MathsBook implements Book {
    private Book book;
    
    public MathsBook(Book book) {
        this.book = book;
    }

    public String getDescription() {
        return book.getDescription() + " of Maths";
    }

    public double cost() {
        return book.cost() + 20.0;
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        Book book = new SimpleBook();
        System.out.println(book.getDescription() + " and cost is " + book.cost());

        book = new MathsBook(book);
        System.out.println(book.getDescription() + " and cost is " + book.cost());
    }
}
