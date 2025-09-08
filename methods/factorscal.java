import java.util.Scanner;

public class factorscal {

    // Method to find factors of a number and return as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop: count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array with factor count
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            // Find factors
            int[] factors = findFactors(number);

            // Display factors
            System.out.print("Factors of " + number + ": ");
            for (int f : factors) {
                System.out.print(f + " ");
            }
            System.out.println();

            // Calculate and display results
            System.out.println("Sum of factors: " + sumOfFactors(factors));
            System.out.println("Product of factors: " + productOfFactors(factors));
            System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        }

        scanner.close();
    }
}
