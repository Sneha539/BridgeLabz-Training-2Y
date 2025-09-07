import java.util.Scanner;
import java.util.Random;

public class voting {

    // Method to generate random 2-digit ages
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            // Generate random 2-digit age (10 to 99)
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; // invalid negative age
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; // can vote
            } else {
                result[i][1] = "false"; // cannot vote
            }
        }
        return result;
    }

    // Method to display results in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println("------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] eligibility = checkEligibility(ages);

        // Display results
        displayTable(eligibility);

        sc.close();
    }
}
