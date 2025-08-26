import java.util.Scanner;

public class L1Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        
        while(true){

            
            double input = sc.nextDouble();
            if(input<=0)
            {
            break;
            }
            else{
                total+=input;
            }

        

        }
        System.out.println("Total value"+total);


        
    }
}