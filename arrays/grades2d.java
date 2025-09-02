import java.util.Scanner;

public class grades2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // 2D array to store marks [student][subject]
        int[][] marks = new int[n][3];  
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1 ? "Chemistry" : "Maths");

                // Validate input
                while (true) {
                    System.out.print(subject + " marks: ");
                    int m = sc.nextInt();
                    if (m >= 0) {
                        marks[i][j] = m;  // store in 2D array
                        break;
                    } else {
                        System.out.println("Marks cannot be negative. Please re-enter.");
                    }
                }
            }

            // Calculate total using 2D array
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            // Compute percentage
            percentages[i] = (total / 300.0) * 100;

            // Assign grade
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("\n=== Student Report ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                               " => Physics: " + marks[i][0] +
                               ", Chemistry: " + marks[i][1] +
                               ", Maths: " + marks[i][2] +
                               ", Percentage: " + String.format("%.2f", percentages[i]) + "%" +
                               ", Grade: " + grades[i]);
        }

        sc.close();
    }
}
