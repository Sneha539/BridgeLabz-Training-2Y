import java.util.Scanner;

public class l2q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float peri,side;
        peri = input.nextFloat();
        side = peri/4;
        System.out.println("The length of the side is " + side + " whose perimeter is " +peri);
}
}