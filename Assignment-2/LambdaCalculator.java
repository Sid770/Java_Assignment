// Define a functional interface
@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class LambdaCalculator {
    public static void main(String[] args) {
        // Lambda expression for addition
        Calculator addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        Calculator subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        Calculator multiplication = (a, b) -> a * b;

        // Using the lambda functions
        System.out.println("Addition: " + addition.compute(10, 5));
        System.out.println("Subtraction: " + subtraction.compute(10, 5));
        System.out.println("Multiplication: " + multiplication.compute(10, 5));
    }
}
