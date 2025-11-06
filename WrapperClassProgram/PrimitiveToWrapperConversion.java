
import java.util.*;
public class PrimitiveToWrapperConversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer obj=Integer.valueOf(n);
        System.out.println("Primitive: "+n);
        System.out.println("Object: "+obj);
    }
}
