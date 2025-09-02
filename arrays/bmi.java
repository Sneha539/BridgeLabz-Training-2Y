import java.util.Scanner;

public class bmi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Arrays to store values
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input for each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            
            System.out.print("Weight (in kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine status based on BMI table
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n=== BMI Report ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " => " +
                               "Height: " + height[i] + " m, " +
                               "Weight: " + weight[i] + " kg, " +
                               "BMI: " + String.format("%.2f", bmi[i]) + ", " +
                               "Status: " + status[i]);
        }

        sc.close();
    }
}
