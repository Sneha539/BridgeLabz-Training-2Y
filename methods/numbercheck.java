import java.util.Scanner;

public class numbercheck {

    // Method to check number sign
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check the number
        int result = checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number " + number + " is positive.");
        } else if (result == -1) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
