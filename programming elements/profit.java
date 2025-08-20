import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the CP ");
        float cp = sc.nextFloat();
        System.out.print("Enter the SP ");
        float sp = sc.nextFloat();
        if (cp <= sp ){

        
        float profit = sp - cp;
        float profitper = (profit / cp) * 100 ;
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR"+ sp);
        System.out.println("The profit is"+ profit +"and profit percentage is "+ profitper);
        }
        else {
            float loss = cp - sp ;
            float lossper = (loss / cp )* 100;
            System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR"+ sp);
            System.out.println("The loss is"+ loss +"and loss percentage is "+ lossper);
        }


    }
    }