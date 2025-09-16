abstract class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    abstract double calculateDiscount();
}

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }
    double calculateDiscount() {
        return price * 0.9;
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }
    double calculateDiscount() {
        return price * 0.8;
    }
}

class Groceries extends Product {
    Groceries(String name, double price) {
        super(name, price);
    }
    double calculateDiscount() {
        return price * 0.95;
    }
}

public class main2 {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 50000);
        Product p2 = new Clothing("Shirt", 2000);
        Product p3 = new Groceries("Rice", 1000);
        System.out.println(p1.name + ": " + p1.calculateDiscount());
        System.out.println(p2.name + ": " + p2.calculateDiscount());
        System.out.println(p3.name + ": " + p3.calculateDiscount());
    }
}
