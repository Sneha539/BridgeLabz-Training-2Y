import java.util.Scanner;

public class sumnat {

    // Recursive method to find the sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + sumRecursive(n - 1);
    }

    // Method to calculate sum using formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number greater than 0.");
        } else {
            // Calculate using recursion
            int recursiveSum = sumRecursive(n);

            // Calculate using formula
            int formulaSum = sumFormula(n);

            // Display results
            System.out.println("Sum of first " + n + " natural numbers (recursive method): " + recursiveSum);
            System.out.println("Sum of first " + n + " natural numbers (formula method): " + formulaSum);

            // Compare results
            if (recursiveSum == formulaSum) {
                System.out.println("✅ Both methods give the same result.");
            } else {
                System.out.println("❌ The results do not match.");
            }
        }

        scanner.close();
    }
}
