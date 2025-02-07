// question 10

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append operation
        sb.append(" World!");
        System.out.println("After append: " + sb);

        // Insert operation
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replace operation
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb);

        // Delete operation
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // Reverse operation
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
