import java.util.Scanner;

public class L1Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sumLoop = 0;
        int sumFormula = 0;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                sumLoop += i;
            }

            sumFormula = num * (num + 1) / 2;

        }
            if (sumLoop == sumFormula) {
                System.out.println("Both computations are correct.");
            }
        } 
}
