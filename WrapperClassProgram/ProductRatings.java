
import java.util.*;
import java.util.stream.*;
public class ProductRatings {
    public static void main(String[] args){
        int[] p={4,5,3};
        ArrayList<Integer> q=new ArrayList<>(Arrays.asList(5,null,4));
        ArrayList<Integer> all=new ArrayList<>();
        for(int i:p)all.add(i);
        all.addAll(q);
        double avg=all.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);
    }
}
