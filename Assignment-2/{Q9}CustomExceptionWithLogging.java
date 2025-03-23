import java.io.IOException;
import java.util.logging.*;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionWithLogging {
    // Logger setup
    private static final Logger logger = Logger.getLogger(CustomExceptionWithLogging.class.getName());

    static {
        try {
            // Configure logger to write to a file
            FileHandler fileHandler = new FileHandler("error.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.out.println("Logging setup failed: " + e.getMessage());
        }
    }

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
            logger.severe("Error: " + e.getMessage()); // Log error to file
        }
    }
}
