import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Error: Please enter a non-negative integer.");
            sc.close();
            return;
        }

        // Find count of digits
        int temp = number;
        int count = 0;
        if (temp == 0) {
            count = 1; // special case for 0
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create array for reverse order
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Display reversed number
        System.out.println("\nReversed number using array:");
        for (int d : reversed) {
            System.out.print(d);
        }

        sc.close();
    }
}
