import java.util.Scanner;

public class handshake {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required to shake hands.");
        } else {
            // Calculate handshakes
            int maxHandshakes = calculateHandshakes(numberOfStudents);

            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                               " students is " + maxHandshakes + ".");
        }

        scanner.close();
    }
}
