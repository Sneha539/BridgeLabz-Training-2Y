import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("Average Marks: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A+ | Remarks: Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade: A | Remarks: Very Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: B | Remarks: Good");
        } else if (percentage >= 50) {
            System.out.println("Grade: C | Remarks: Average");
        } else {
            System.out.println("Grade: F | Remarks: Fail");
        }
    }
}
