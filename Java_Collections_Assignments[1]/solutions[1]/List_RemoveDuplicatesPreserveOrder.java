
import java.util.*;
public class List_RemoveDuplicatesPreserveOrder {
    public static <T> List<T> removeDuplicates(List<T> list){
        Set<T> seen = new HashSet<>();
        List<T> res = new ArrayList<>();
        for (T item : list) {
            if (seen.add(item)) res.add(item);
        }
        return res;
    }
    public static void main(String[] args){
        List<Integer> in = Arrays.asList(3,1,2,2,3,4);
        System.out.println(removeDuplicates(in));
    }
}
