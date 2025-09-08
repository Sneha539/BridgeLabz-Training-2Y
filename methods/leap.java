import java.util.Scanner;

public class leap {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year rule:
        // Divisible by 4 and not divisible by 100 OR divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get year input from user
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Validate Gregorian calendar condition
        if (year < 1582) {
            System.out.println("The Leap Year calculation is valid only for year >= 1582 (Gregorian calendar).");
        } else {
            // Check leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        scanner.close();
    }
}
