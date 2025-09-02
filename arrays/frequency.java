import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Handle negative numbers
        if (number < 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        // Convert number to string to count digits
        String numStr = Long.toString(number);
        int length = numStr.length();

        // Store digits in an array
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char to int
        }

        // Frequency array for digits 0-9
        int[] frequency = new int[10];
        for (int i = 0; i < length; i++) {
            frequency[digits[i]]++;
        }

        // Display digit frequencies
        System.out.println("\nDigit Frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s).");
            }
        }

        sc.close();
    }
}
