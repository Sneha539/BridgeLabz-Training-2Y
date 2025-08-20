import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        float km = sc.nextFloat();

        float conversionFactor = 0.621371f;
        float miles = km * conversionFactor;

        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        
    }
}