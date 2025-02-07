// question 11

public class StringImmutabilityExample {
    public static void main(String[] args) {
        // Creating a String
        String str1 = "Hello";
        
        // Trying to modify the string
        str1.concat(" World!");

        // Printing the original string
        System.out.println("Original String: " + str1); // Still "Hello"

        // Assigning the modified string to a new reference
        String str2 = str1.concat(" World!");
        System.out.println("New String: " + str2); // "Hello World!"
    }
}

