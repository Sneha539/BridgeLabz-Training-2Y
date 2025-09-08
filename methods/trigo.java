import java.util.Scanner;

public class trigo {

    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angle from user
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate trigonometric functions
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("For angle %.2f degrees:%n", angle);
        System.out.printf("Sine: %.4f%n", trigValues[0]);
        System.out.printf("Cosine: %.4f%n", trigValues[1]);
        System.out.printf("Tangent: %.4f%n", trigValues[2]);

        scanner.close();
    }
}
