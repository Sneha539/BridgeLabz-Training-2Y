import java.util.Scanner;

public class Sfees {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee: INR ");
        double Fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double DiscountPercent = input.nextDouble();

        double Discount = (Fee * DiscountPercent) / 100;
        double FinalFee = Fee - Discount;

        System.out.println("The discount amount is INR " + Discount + " and final discounted fee is INR " + FinalFee);
    }
    }