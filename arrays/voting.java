import java.util.Scanner;

public class voting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        System.out.println("=== Voting Eligibility Checker ===");

        // Taking input for ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\n=== Results ===");
        // Checking eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            if (age < 0) {
                System.out.println("Student " + (i + 1) + " has an invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }

        sc.close();
    }
}
