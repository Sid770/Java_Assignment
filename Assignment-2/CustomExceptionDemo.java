// Custom Exception
class InvalidAgeException extends Exception {
    // Constructor to initialize exception message
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Access denied!");
        } else {
            System.out.println("Access granted. You are eligible.");
        }
    }

    public static void main(String[] args) {
        int userAge = 16; // Example: User is 16 years old

        try {
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
