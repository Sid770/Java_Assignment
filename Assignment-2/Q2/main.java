// Import the package
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class MainApp {
    public static void main(String[] args) {
        // Create Circle and Rectangle objects
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // Display area and perimeter for Circle
        System.out.println("Circle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        // Display area and perimeter for Rectangle
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
