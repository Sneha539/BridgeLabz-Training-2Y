
import java.util.*;
public class Queue_StackUsingQueues {
    static class MyStack {
        private Queue<Integer> q1 = new LinkedList<>();
        private Queue<Integer> q2 = new LinkedList<>();
        public void push(int x){ q1.add(x); }
        public int pop(){
            if (q1.isEmpty()) throw new NoSuchElementException();
            while(q1.size()>1) q2.add(q1.remove());
            int top = q1.remove();
            Queue<Integer> tmp = q1; q1 = q2; q2 = tmp;
            return top;
        }
        public int top(){
            if (q1.isEmpty()) throw new NoSuchElementException();
            while(q1.size()>1) q2.add(q1.remove());
            int top = q1.remove();
            q2.add(top);
            Queue<Integer> tmp = q1; q1 = q2; q2 = tmp;
            return top;
        }
        public boolean isEmpty(){ return q1.isEmpty(); }
    }
    public static void main(String[] args){
        MyStack s = new MyStack();
        s.push(1); s.push(2); s.push(3);
        System.out.println(s.pop()); // 3
    }
}
