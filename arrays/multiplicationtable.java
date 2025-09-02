import java.util.Scanner;

public class multiplicationtable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        // Array to store results (1 to 10)
        int[] table = new int[10];

        // Fill the array with multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display results
        System.out.println("\n=== Multiplication Table of " + number + " ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
