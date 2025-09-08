import java.util.Scanner;

public class no5 {

    // Method to check Prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check Spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check Automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr);
    }

    // Method to check Buzz number
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("\nChecking properties of number: " + number);
        System.out.println("Prime Number? " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Neon Number? " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Spy Number? " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Automorphic Number? " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Buzz Number? " + (isBuzz(number) ? "Yes" : "No"));

        scanner.close();
    }
}
