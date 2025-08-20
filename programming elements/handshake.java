import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of student ");
        int n = sc.nextInt();
        int handshake = (n * (n - 1)) / 2;
        System.out.println("No of possible handshake"+handshake);
    }}