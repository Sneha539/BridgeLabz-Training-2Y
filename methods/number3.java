import java.util.Scanner;

public class number3 {

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to calculate sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to calculate sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // 10 digits (0–9), [digit, count]

        // Initialize digit values
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count frequency
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Extract digits
        int count = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("\nNumber of digits: " + count);

        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Sum and Sum of Squares
        int sumDigits = sumOfDigits(digits);
        int sumSquares = sumOfSquares(digits);

        System.out.println("Sum of digits: " + sumDigits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Harshad Number Check
        System.out.println("Harshad Number? " + (isHarshadNumber(number, digits) ? "Yes" : "No"));

        // Frequency
        System.out.println("Digit Frequencies:");
        int[][] frequencies = digitFrequency(digits);
        for (int i = 0; i < 10; i++) {
            if (frequencies[i][1] > 0) {
                System.out.println("Digit " + frequencies[i][0] + " occurs " + frequencies[i][1] + " time(s)");
            }
        }

        scanner.close();
    }
}
