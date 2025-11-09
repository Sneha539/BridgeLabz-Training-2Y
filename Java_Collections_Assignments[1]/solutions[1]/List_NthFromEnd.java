
import java.util.*;
public class List_NthFromEnd {
    // Using two-pointer technique on LinkedList via list iterator indices
    public static <T> T nthFromEnd(LinkedList<T> list, int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be >= 1");
        Iterator<T> it1 = list.iterator();
        Iterator<T> it2 = list.iterator();
        for (int i = 0; i < n; i++) {
            if (!it1.hasNext()) throw new NoSuchElementException("List too short");
            it1.next();
        }
        while (it1.hasNext()) {
            it1.next();
            it2.next();
        }
        return it2.next();
    }
    public static void main(String[] args){
        LinkedList<String> l = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(nthFromEnd(l,2)); // D
    }
}
