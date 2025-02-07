// question 32

public class StringComparisonExample {
    public static void main(String[] args) {
        // String literals (stored in String Pool)
        String str1 = "Hello";
        String str2 = "Hello";

        // String objects (stored in Heap memory)
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // Using == (Reference comparison)
        System.out.println("str1 == str2: " + (str1 == str2)); // true (same reference in String Pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different memory locations)
        System.out.println("str3 == str4: " + (str3 == str4)); // false (different objects in Heap)

        // Using equals() (Content comparison)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (same content)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same content)
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // true (same content)
    }
}

