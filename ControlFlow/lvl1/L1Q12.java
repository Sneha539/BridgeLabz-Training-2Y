// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result
import java.util.Scanner;

public class L1Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int sumFormula=0;
            int sumLoop = 0;
        
        if(num>0){
            
            int i = 1;
           
            while (i <= num) {
                sumLoop += i;
                i++;
            }
            sumFormula = num * (num + 1) / 2;
            


        }
        if (sumLoop == sumFormula) {
                System.out.println("Both computations are correct.");
            } 


    }}