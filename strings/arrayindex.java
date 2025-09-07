import java.util.Scanner;

public class arrayindex {

    // Method that generates ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index beyond array size
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    // Method that handles the exception safely
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // First call - will throw exception (uncomment to see crash)
        // generateException(names);

        // Second call - handles exception properly
        handleException(names);

        sc.close();
    }
}
