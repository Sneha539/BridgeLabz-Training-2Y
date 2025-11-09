
import java.util.*;
public class Queue_GenerateBinaryNumbers {
    public static List<String> generate(int n){
        List<String> res = new ArrayList<>();
        if (n <= 0) return res;
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < n; i++) {
            String s = q.remove();
            res.add(s);
            q.add(s + "0");
            q.add(s + "1");
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(generate(5));
    }
}
