import java.util.Scanner;

public class Harry{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current year");
        int year = sc.nextInt();
        System.out.println("Enter the birthyear year");
        int birthyear = sc.nextInt();
        int age = year - birthyear;

        System.out.println("Harry's age in"+ year+ " is"+ age);

        


    }
}