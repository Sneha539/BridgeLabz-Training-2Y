import java.util.Scanner;

public class l2q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float disFeet,disMile,disYard;
        disFeet = input.nextFloat();
        disYard = disFeet / 3f;
        disMile = (1f/1760f) * disYard;
        System.out.println("The distance in yards is " + disYard + "while the distance in miles is " + disMile);
}
}