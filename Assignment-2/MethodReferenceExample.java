// Functional Interface
@FunctionalInterface
interface SquareCalculator {
    int calculate(int x);
}

public class MethodReferenceExample {
    // Static method to calculate square
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        // Using method reference to refer to the square method
        SquareCalculator sq = MethodReferenceExample::square;

        // Calling the method using the functional interface
        int num = 5;
        System.out.println("Square of " + num + " is: " + sq.calculate(num));
    }
}
