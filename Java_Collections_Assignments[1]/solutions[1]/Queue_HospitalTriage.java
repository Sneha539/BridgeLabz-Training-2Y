
import java.util.*;
public class Queue_HospitalTriage {
    static class Patient implements Comparable<Patient>{
        String name;
        int severity;
        public Patient(String n,int s){name=n;severity=s;}
        public int compareTo(Patient o){ // higher severity first
            return Integer.compare(o.severity, this.severity);
        }
        public String toString(){return name+"("+severity+")";}
    }
    public static void main(String[] args){
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("John",3));
        pq.add(new Patient("Alice",5));
        pq.add(new Patient("Bob",2));
        while(!pq.isEmpty()) System.out.println(pq.remove());
    }
}
