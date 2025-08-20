import java.util.Scanner;

public class Sam{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of MAths");
        int maths = sc.nextInt();
        System.out.println("Enter the marks of Physics");
        int physics = sc.nextInt();
        System.out.println("Enter the marks of chemistry");
        int chemistry = sc.nextInt();
        int avg = (maths + physics + chemistry) / 3 ;
        System.out.println("Sam’s average mark in PCM is"+avg);
    }
    }