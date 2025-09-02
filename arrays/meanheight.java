import java.util.Scanner;

public class meanheight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];  // Array to store player heights
        double sum = 0.0;

        System.out.println("=== Football Team Mean Height Calculator ===");

        // Get input values
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Print result
        System.out.println("\nThe mean height of the football team is: " + mean);

        sc.close();
    }
}
