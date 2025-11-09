
import java.util.*;
public class Set_SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b){
        Set<T> res = new HashSet<>(a);
        for (T x : b) {
            if (!res.add(x)) res.remove(x);
        }
        return res;
    }
    public static void main(String[] args){
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println(symmetricDifference(s1,s2));
    }
}
