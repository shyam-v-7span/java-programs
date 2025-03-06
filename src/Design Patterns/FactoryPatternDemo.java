interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("drawing circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

// Factory Class
class ShapeFactory {
    public static Shape getShape(String t) {
        if (t.equals("CIRCLE")) {
            return new Circle();
        } else if (t.equals("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();

    }
}
