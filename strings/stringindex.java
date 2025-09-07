import java.util.Scanner;

public class stringindex {

    // Method that generates StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond the string length
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method that handles the exception safely
    public static void handleException(String text) {
        try {
            // Again try to access invalid index
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // First call - will throw exception (uncomment to see crash)
        // generateException(input);

        // Second call - handles exception properly
        handleException(input);

        sc.close();
    }
}
