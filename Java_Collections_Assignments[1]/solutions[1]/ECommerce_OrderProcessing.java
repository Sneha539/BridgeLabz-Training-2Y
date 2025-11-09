
import java.util.*;
class Order {
    String id;
    String details;
    Order(String id, String d){this.id=id;this.details=d;}
    public String toString(){return id+":"+details;}
    public boolean equals(Object o){
        if (!(o instanceof Order)) return false;
        return id.equals(((Order)o).id);
    }
    public int hashCode(){return id.hashCode();}
}
public class ECommerce_OrderProcessing {
    public static void main(String[] args){
        List<Order> all = new ArrayList<>();
        all.add(new Order("o1","itemA"));
        all.add(new Order("o2","itemB"));
        all.add(new Order("o1","itemA-dup"));
        // Remove duplicates using set
        Set<Order> uniques = new LinkedHashSet<>(all);
        System.out.println("Unique orders: " + uniques);
        // Processing queue
        Queue<Order> q = new LinkedList<>(uniques);
        Stack<Order> failed = new Stack<>();
        while(!q.isEmpty()){
            Order o = q.remove();
            System.out.println("Processing " + o);
            if (o.id.equals("o2")) { System.out.println("Failed " + o); failed.push(o); }
        }
        System.out.println("Reprocessing failed:");
        while(!failed.isEmpty()){
            System.out.println("Retrying " + failed.pop());
        }
    }
}
