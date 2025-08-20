import java.util.Scanner;

public class l2q1 {
    public static void main(String[] args){
        float number1,number2;
        Scanner input = new Scanner(System.in);
        number1 = input.nextFloat();
        number2 = input.nextFloat();
        System.out.println("The addition, subtraction, multiplication, and division value of the two numbers " + number1 +  " and " + number2 + " is " + (number1+number2) + ", " + (number1-number2) + ", " + (number1*number2) + ", " + (number1/number2));
}
}