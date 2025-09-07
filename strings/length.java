import java.util.Scanner;

public class length {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception at end
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Length using custom method
        int manualLength = findLength(input);

        // Length using built-in method
        int builtInLength = input.length();

        // Display results
        System.out.println("\nManual length:   " + manualLength);
        System.out.println("Built-in length: " + builtInLength);

        sc.close();
    }
}
