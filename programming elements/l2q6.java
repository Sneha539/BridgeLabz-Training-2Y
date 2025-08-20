import java.util.Scanner;

public class l2q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,quotient,remainder;
        a = input.nextDouble();
        b = input.nextDouble();
        quotient = a/b;
        remainder = a%b;
        System.out.println("The quotient is" + quotient);
        System.out.println("The remainder is" + remainder);
}
}