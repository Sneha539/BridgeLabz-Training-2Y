
import java.util.*;
public class Set_ConvertToSortedList {
    public static List<Integer> toSortedList(Set<Integer> set){
        List<Integer> l = new ArrayList<>(set);
        Collections.sort(l);
        return l;
    }
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>(Arrays.asList(5,3,9,1));
        System.out.println(toSortedList(s));
    }
}
