
import java.util.*;
public class WrapperInCollections {
    public static void main(String[] args){
        double[] p={10.5,20.0,35.75,5.5};
        ArrayList<Double> list=new ArrayList<>();
        for(double i:p)list.add(i);
        double max=Collections.max(list),sum=0;
        for(double i:list)sum+=i;
        System.out.println(max);
        System.out.println(sum/list.size());
    }
}
