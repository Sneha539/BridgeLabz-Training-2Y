
import java.util.*;
public class List_RotateList {
    public static <T> List<T> rotate(List<T> list, int k) {
        int n = list.size();
        if (n == 0) return new ArrayList<>();
        k = ((k % n) + n) % n;
        List<T> res = new ArrayList<>(n);
        for (int i = k; i < n; i++) res.add(list.get(i));
        for (int i = 0; i < k; i++) res.add(list.get(i));
        return res;
    }
    public static void main(String[] args){
        List<Integer> a = Arrays.asList(10,20,30,40,50);
        System.out.println(rotate(a,2));
    }
}
