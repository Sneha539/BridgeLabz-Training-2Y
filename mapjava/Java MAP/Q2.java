import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("A",1); m.put("B",2); m.put("C",1);

        Map<Integer, List<String>> inv = new HashMap<>();
        for(String k : m.keySet()){
            int v = m.get(k);
            if(!inv.containsKey(v)) inv.put(v, new ArrayList<>());
            inv.get(v).add(k);
        }
        System.out.println(inv);
    }
}

