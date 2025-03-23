// Import the package
import utilities.MathUtils;

public class MainApp {
    public static void main(String[] args) {
        // Create an instance of MathUtils
        MathUtils mathUtil = new MathUtils();
        
        // Call the add method
        int sum = mathUtil.add(10, 20);
        
        // Print the result
        System.out.println("Sum of 10 and 20 is: " + sum);
    }
}
