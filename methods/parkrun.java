import java.util.Scanner;

public class parkrun {

    // Method to calculate the number of rounds required
    public static int calculateRounds(double side1, double side2, double side3, double targetDistanceMeters) {
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        // Calculate the number of rounds (rounding up to complete at least target distance)
        int rounds = (int) Math.ceil(targetDistanceMeters / perimeter);
        return rounds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides of the triangular park
        System.out.print("Enter side 1 of the triangle in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangle in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangle in meters: ");
        double side3 = scanner.nextDouble();

        // Target distance in meters (5 km = 5000 meters)
        double targetDistance = 5000;

        // Calculate rounds
        int rounds = calculateRounds(side1, side2, side3, targetDistance);

        // Display result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        scanner.close();
    }
}
