
import java.util.*;
public class Set_UnionIntersection {
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> r = new HashSet<>(a);
        r.addAll(b);
        return r;
    }
    public static <T> Set<T> intersection(Set<T> a, Set<T> b){
        Set<T> r = new HashSet<>(a);
        r.retainAll(b);
        return r;
    }
    public static void main(String[] args){
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println("Union: " + union(s1,s2));
        System.out.println("Intersection: " + intersection(s1,s2));
    }
}
