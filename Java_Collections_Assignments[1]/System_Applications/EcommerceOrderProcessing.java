import java.util.*;

class Order {
    int id;
    String name;
    Order(int id, String name) { this.id = id; this.name = name; }
    public boolean equals(Object o) { return (o instanceof Order) && ((Order) o).id == id; }
    public int hashCode() { return Objects.hash(id); }
    public String toString() { return name + "(" + id + ")"; }
}

public class EcommerceOrderProcessing {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>(Arrays.asList(
            new Order(1, "Phone"),
            new Order(2, "Laptop"),
            new Order(1, "Phone")
        ));

        Set<Order> uniqueOrders = new HashSet<>(orders);
        Queue<Order> processingQueue = new LinkedList<>(uniqueOrders);
        Stack<Order> failedOrders = new Stack<>();

        while (!processingQueue.isEmpty()) {
            Order o = processingQueue.remove();
            if (o.id == 2) failedOrders.push(o); // simulate failure
            else System.out.println("Processed: " + o);
        }

        System.out.println("Failed Orders: " + failedOrders);
    }
}