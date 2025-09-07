import java.util.Scanner;

public class illegalargument {

    // Method that generates IllegalArgumentException
    public static void generateException(String text) {
        // Start index > end index → throws IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method that handles the exception
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // First call - will throw exception (uncomment to see crash)
        // generateException(input);

        // Second call - handles exception safely
        handleException(input);

        sc.close();
    }
}
