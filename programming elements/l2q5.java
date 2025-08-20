import java.util.Scanner;

public class l2q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unitPrice,quantity,total;
        unitPrice = input.nextInt();
        quantity = input.nextInt();
        total = unitPrice*quantity;
        System.out.println("The total purchase price is INR "+ total + " if the quantity is " + quantity + " and the unit price is INR " + unitPrice);
}
}