import java.util.Scanner;

public class number {

    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Check each number
        System.out.println("\nAnalysis of numbers:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else {
                System.out.println("Number " + num + " is Negative.");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println("\nComparison of first and last numbers:");
        if (result == 0) {
            System.out.println("First number (" + numbers[0] + ") is Equal to Last number (" + numbers[numbers.length - 1] + ")");
        } else if (result == 1) {
            System.out.println("First number (" + numbers[0] + ") is Greater than Last number (" + numbers[numbers.length - 1] + ")");
        } else {
            System.out.println("First number (" + numbers[0] + ") is Less than Last number (" + numbers[numbers.length - 1] + ")");
        }

        scanner.close();
    }
}
