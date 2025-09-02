import java.util.Scanner;

public class bmi2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // 2D array to store: weight, height, BMI
        double[][] personData = new double[number][3];
        // Array to store status
        String[] weightStatus = new String[number];

        // Input for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            // Input weight, ensure positive
            double weight;
            while (true) {
                System.out.print("Weight (in kg): ");
                weight = sc.nextDouble();
                if (weight > 0) break;
                System.out.println("Please enter a positive value for weight.");
            }

            // Input height, ensure positive
            double height;
            while (true) {
                System.out.print("Height (in meters): ");
                height = sc.nextDouble();
                if (height > 0) break;
                System.out.println("Please enter a positive value for height.");
            }

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n=== BMI Report ===");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                               " => Height: " + personData[i][1] + " m, " +
                               "Weight: " + personData[i][0] + " kg, " +
                               "BMI: " + String.format("%.2f", personData[i][2]) + ", " +
                               "Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
