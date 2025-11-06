
import java.util.*;
public class WrapperPerformance {
    public static void main(String[] args){
        long s1=System.currentTimeMillis();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<1000000;i++)l.add(i);
        long sum1=0;for(int i:l)sum1+=i;
        long e1=System.currentTimeMillis();
        long s2=System.currentTimeMillis();
        int[] a=new int[1000000];
        for(int i=0;i<1000000;i++)a[i]=i;
        long sum2=0;for(int i:a)sum2+=i;
        long e2=System.currentTimeMillis();
        System.out.println("List time:"+(e1-s1)+" Array time:"+(e2-s2));
    }
}
