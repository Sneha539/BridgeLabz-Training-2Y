import java.util.Scanner;

public class l2q2 {
    public static void main(String[] args){
     float base,height,areaSq,areaCm;
     Scanner input = new Scanner(System.in);
     base = input.nextFloat();
     height = input.nextFloat();
     areaCm = 0.5f * base * height;
     areaSq = areaCm/2.54f;
     System.out.println("The Area of the triangle in sq in is " + areaSq + " and sq cm is " + areaCm);
}
}