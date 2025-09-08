import java.util.Scanner;

public class no6 {

    // Helper method to find sum of proper divisors
    public static int sumOfDivisors(int number) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (number == 1) ? 0 : sum;
    }

    // Method to check Perfect number
    public static boolean isPerfect(int number) {
        return number > 0 && sumOfDivisors(number) == number;
    }

    // Method to check Abundant number
    public static boolean isAbundant(int number) {
        return number > 0 && sumOfDivisors(number) > number;
    }

    // Method to check Deficient number
    public static boolean isDeficient(int number) {
        return number > 0 && sumOfDivisors(number) < number;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong number
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("\nChecking properties of number: " + number);
        System.out.println("Perfect Number? " + (isPerfect(number) ? "Yes" : "No"));
        System.out.println("Abundant Number? " + (isAbundant(number) ? "Yes" : "No"));
        System.out.println("Deficient Number? " + (isDeficient(number) ? "Yes" : "No"));
        System.out.println("Strong Number? " + (isStrong(number) ? "Yes" : "No"));

        scanner.close();
    }
}
