import java.util.Scanner;

public class sum {

    // Method to calculate sum of n natural numbers using a loop
    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate sum
            int sum = sumOfNumbers(n);

            // Display result
            System.out.println("The sum of first " + n + " natural numbers is " + sum + ".");
        }

        scanner.close();
    }
}
