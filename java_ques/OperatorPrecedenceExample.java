// question 35

public class OperatorPrecedenceExample {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2; 
        System.out.println("10 + 5 * 2 = " + result1); // Multiplication (*) has higher precedence than addition (+)

        int result2 = (10 + 5) * 2; 
        System.out.println("(10 + 5) * 2 = " + result2); // Parentheses alter precedence

        int result3 = 20 / 4 + 3 * 2;
        System.out.println("20 / 4 + 3 * 2 = " + result3); // Division (/) and multiplication (*) happen before addition (+)

        int result4 = 10 - 5 + 3;
        System.out.println("10 - 5 + 3 = " + result4); // Left to right evaluation for + and -

        boolean result5 = 10 > 5 && 5 < 2 || 3 == 3;
        System.out.println("10 > 5 && 5 < 2 || 3 == 3 = " + result5); // AND (&&) has higher precedence than OR (||)

        int a = 5, b = 10, c = 15;
        int result6 = a + b * c / 5;
        System.out.println("5 + 10 * 15 / 5 = " + result6); // Multiplication and division first, then addition

        int result7 = a++ + --b;
        System.out.println("5++ + --10 = " + result7); // Post-increment and pre-decrement evaluation
    }
}

