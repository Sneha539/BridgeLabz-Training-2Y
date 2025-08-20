import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height in cm ");
        float height = sc.nextFloat();
        float inches = height /2.54f;
        float feet = height/12;
        System.out.println("Your Height in cm is"+ height+" while in feet is"+feet+"and inches is"+inches);
    }}