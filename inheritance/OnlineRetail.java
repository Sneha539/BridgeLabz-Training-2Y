import java.util.Date;

// Base class
class Order {
    int orderId;
    Date orderDate;

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderDate = new Date(); // Sets current date and time
    }

    public String getOrderStatus() {
        return "Order Placed.";
    }
}

// Subclass extending Order
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(int orderId, String trackingNumber) {
        super(orderId);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped. Tracking #: " + trackingNumber;
    }
}

// Subclass extending ShippedOrder
class DeliveredOrder extends ShippedOrder {
    Date deliveryDate;

    public DeliveredOrder(int orderId, String trackingNumber) {
        super(orderId, trackingNumber);
        this.deliveryDate = new Date(); // Sets current date and time
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

// Main class to test the hierarchy
public class OnlineRetail {
    public static void main(String[] args) {
        Order order = new Order(101);
        ShippedOrder shipped = new ShippedOrder(102, "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder(103, "TRK67890");

        System.out.println("Order 101 Status: " + order.getOrderStatus());
        System.out.println("Order 102 Status: " + shipped.getOrderStatus());
        System.out.println("Order 103 Status: " + delivered.getOrderStatus());
    }
}