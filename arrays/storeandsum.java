import java.util.Scanner;

public class storeandsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  // Array to hold up to 10 values
        double total = 0.0;                 // Variable to hold the total
        int index = 0;                      // Position in the array

        System.out.println("=== Store up to 10 numbers (enter 0 or negative to stop) ===");

        // Infinite loop for input
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = sc.nextDouble();

            // Stop conditions
            if (input <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Array is full. Cannot store more than 10 numbers.");
                break;
            }

            // Store value and move index
            numbers[index] = input;
            index++;
        }

        // Summing values
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display results
        System.out.println("\n=== Entered Numbers ===");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("\nTotal Sum: " + total);

        sc.close();
    }
}
