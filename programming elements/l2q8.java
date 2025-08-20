import java.util.Scanner;

public class l2q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,op1,op2,op3,op4;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        op1 = a + b *c;
        op2 = a * b + c;
        op3 = c + a / b;
        op4 = a % b + c;
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + "and "+op4);
}
}