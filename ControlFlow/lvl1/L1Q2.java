
import java.util.Scanner;

public class L1Q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1<=num2 && num2<=num3){
            System.out.println("YES the first number is smallest");
        }
        else{
            System.out.println("NO it is not");
        }

       

    }
}