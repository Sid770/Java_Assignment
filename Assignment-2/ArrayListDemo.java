// Import the ArrayList class from java.util
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying the elements using a for-each loop
        System.out.println("List of Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Accessing elements using index
        System.out.println("\nElement at index 2: " + numbers.get(2));

        // Removing an element
        numbers.remove(1); // Removes the element at index 1 (20)
        System.out.println("\nAfter removing element at index 1:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Checking if a value exists
        if (numbers.contains(30)) {
            System.out.println("\n30 is present in the list.");
        }

        // Displaying the size of the ArrayList
        System.out.println("\nSize of ArrayList: " + numbers.size());
    }
}
