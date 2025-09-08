import java.util.Scanner;

public class bmi {

    // Method to calculate BMI and populate in the array
    public static void calculateBMI(double[][] members) {
        for (int i = 0; i < members.length; i++) {
            double weight = members[i][0]; // in kg
            double heightCm = members[i][1]; // in cm
            double heightM = heightCm / 100; // convert cm to meters
            double bmi = weight / (heightM * heightM); // BMI formula
            members[i][2] = bmi; // store BMI in the 3rd column
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] members) {
        String[] status = new String[members.length];

        for (int i = 0; i < members.length; i++) {
            double bmi = members[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else if (bmi >= 40.0) {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array with 10 rows (persons) and 3 columns (weight, height, BMI)
        double[][] members = new double[10][3];

        // Input weight and height
        System.out.println("Enter weight (kg) and height (cm) of 10 team members:");
        for (int i = 0; i < members.length; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            members[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " height (cm): ");
            members[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for all persons
        calculateBMI(members);

        // Get BMI Status for all persons
        String[] status = getBMIStatus(members);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < members.length; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), members[i][0], members[i][1], members[i][2], status[i]);
        }

        scanner.close();
    }
}
