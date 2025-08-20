import java.util.Scanner;

public class Pen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of student ");
        int student  = sc.nextInt();
        System.out.print("Enter the no of pen ");
        int pen  = sc.nextInt();

        int no = pen /student;
        int left = pen % student;
        System.out.println("The Pen Per Student is" + no + " and the remaining pen not distributed is " + left);


    }}