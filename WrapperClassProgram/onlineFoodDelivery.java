 import java.util.ArrayList;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

interface Discountable {
    double applyDiscount(double amount);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg Items.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 50; // extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + nonVegCharge) * getQuantity();
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.95; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on Non-Veg Items.";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();

        VegItem veg1 = new VegItem("Paneer Butter Masala", 250, 2);
        NonVegItem nonVeg1 = new NonVegItem("Chicken Biryani", 300, 1);

        order.add(veg1);
        order.add(nonVeg1);

        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            System.out.println("Total Price (before discount): " + total);

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                double finalPrice = d.applyDiscount(total);
                System.out.println(d.getDiscountDetails());
                System.out.println("Final Price (after discount): " + finalPrice);
            }

            System.out.println();
        }
    }
}
