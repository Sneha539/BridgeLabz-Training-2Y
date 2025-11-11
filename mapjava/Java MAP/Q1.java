import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        String s = "Hello world, hello Java!";
        s = s.toLowerCase().replaceAll("[^a-z ]", "");
        String[] arr = s.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for(String w : arr){
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        System.out.println(map);
    }
}
