abstract class FoodItem {
    String name;
    double price;
    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    VegItem(String name, double price) {
        super(name, price);
    }
    double calculateTotalPrice() {
        return price;
    }
}

class NonVegItem extends FoodItem {
    NonVegItem(String name, double price) {
        super(name, price);
    }
    double calculateTotalPrice() {
        return price + 50;
    }
}

public class main6 {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer", 200);
        FoodItem f2 = new NonVegItem("Chicken", 300);
        System.out.println(f1.name + ": " + f1.calculateTotalPrice());
        System.out.println(f2.name + ": " + f2.calculateTotalPrice());
    }
}