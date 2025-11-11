import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("A",10); m.put("B",20); m.put("C",15);

        String ans = null;
        int max = Integer.MIN_VALUE;
        for(String k : m.keySet()){
            int v = m.get(k);
            if(v > max){
                max = v;
                ans = k;
            }
        }
        System.out.println(ans);
    }
}
