
import java.util.*;
public class Queue_ReverseQueue {
    public static <T> Queue<T> reverseQueue(Queue<T> q) {
        Stack<T> st = new Stack<>();
        while (!q.isEmpty()) st.push(q.remove());
        while (!st.isEmpty()) q.add(st.pop());
        return q;
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        System.out.println("Before: " + q);
        System.out.println("After: " + reverseQueue(q));
    }
}
