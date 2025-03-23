// Import necessary classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> words = new ArrayList<>();
        words.add("Banana");
        words.add("Apple");
        words.add("Mango");
        words.add("Grapes");
        words.add("Orange");

        // Sorting in descending order using lambda expression
        Collections.sort(words, (s1, s2) -> s2.compareTo(s1));

        // Display the sorted list
        System.out.println("Strings in Descending Order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
