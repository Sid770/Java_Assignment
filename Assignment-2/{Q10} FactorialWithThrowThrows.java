import java.util.Scanner;

// Custom Exception for Negative Input
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class FactorialWithThrowThrows {
    // Method to calculate factorial with 'throws' declaration
    public static long factorial(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Factorial is not defined for negative numbers!");
        }
        
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a number to calculate factorial: ");
        int number = scanner.nextInt();

        try {
            long result = factorial(number);  // Method call with exception handling
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
