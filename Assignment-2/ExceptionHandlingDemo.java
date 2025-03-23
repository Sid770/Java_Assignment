import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter numerator: ");
        int num = scanner.nextInt();
        
        System.out.print("Enter denominator: ");
        int den = scanner.nextInt();

        // Demonstrating try-catch
        try {
            int result = num / den;  // May cause ArithmeticException if den = 0
            System.out.println("Result using try-catch: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }

        // Demonstrating try-catch-finally
        try {
            int result = num / den;  // May cause ArithmeticException if den = 0
            System.out.println("Result using try-catch-finally: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero in try-catch-finally!");
        } finally {
            System.out.println("Finally block executed. Cleaning up resources...");
        }

        scanner.close();
    }
}
