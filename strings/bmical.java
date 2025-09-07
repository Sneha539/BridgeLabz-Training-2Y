import java.util.Scanner;

public class bmical {

    // Method to compute BMI and return status
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weight / (heightM * heightM);

        // Round BMI to 2 decimals
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.valueOf(bmi), status};
    }

    // Method to calculate BMI and status for all persons
    public static String[][] processBMI(double[][] hwData) {
        String[][] result = new String[hwData.length][4]; 
        // [weight, height, bmi, status]

        for (int i = 0; i < hwData.length; i++) {
            double weight = hwData[i][0];
            double height = hwData[i][1];

            String[] bmiResult = computeBMI(weight, height);

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }
        return result;
    }

    // Method to display table
    public static void displayTable(String[][] table) {
        System.out.println("\nBMI Report:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t\t%s%n",
                    (i + 1), table[i][0], table[i][1], table[i][2], table[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] hwData = new double[10][2]; // [weight, height]

        // Input height and weight for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            hwData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            hwData[i][1] = sc.nextDouble();
        }

        // Process BMI
        String[][] result = processBMI(hwData);

        // Display results
        displayTable(result);

        sc.close();
    }
}
