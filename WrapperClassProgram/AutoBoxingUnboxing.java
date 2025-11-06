
import java.util.*;
public class AutoBoxingUnboxing {
    public static void main(String[] args){
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=10;i+=2)l.add(i);
        int s=0;for(int i:l)s+=i;
        System.out.println("Sum of numbers = "+s);
    }
}
