
import java.util.*;
public class Queue_CircularBuffer {
    static class CircularBuffer<T> {
        private Object[] buf;
        private int head=0, tail=0, size=0;
        public CircularBuffer(int capacity){ buf = new Object[capacity]; }
        public void insert(T x){
            if (size == buf.length) { // overwrite oldest
                buf[tail] = x;
                tail = (tail+1)%buf.length;
                head = tail; // oldest moves forward
            } else {
                buf[tail] = x;
                tail = (tail+1)%buf.length;
                size++;
            }
        }
        public List<T> toList(){
            List<T> r=new ArrayList<>();
            for(int i=0;i<size;i++){
                @SuppressWarnings("unchecked")
                T v=(T)buf[(head+i)%buf.length];
                r.add(v);
            }
            return r;
        }
    }
    public static void main(String[] args){
        CircularBuffer<Integer> b = new CircularBuffer<>(3);
        b.insert(1); b.insert(2); b.insert(3); b.insert(4);
        System.out.println(b.toList()); // [2,3,4]
    }
}
