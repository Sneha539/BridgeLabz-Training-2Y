import java.util.ArrayList;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double warrantyCharge;

    public Electronics(int productId, String name, double price, double warrantyCharge) {
        super(productId, name, price);
        this.warrantyCharge = warrantyCharge;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

    @Override
    public double calculateTax() {
        return (getPrice() + warrantyCharge) * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: 18% (GST on Electronics)";
    }
}

class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: 5% (GST on Clothing)";
    }
}

class Groceries extends Product {
    private double weight;

    public Groceries(int productId, String name, double price, double weight) {
        super(productId, name, price);
        this.weight = weight;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Electronics e1 = new Electronics(201, "Laptop", 50000, 2000);
        Clothing c1 = new Clothing(202, "T-Shirt", 1000, "L");
        Groceries g1 = new Groceries(203, "Rice", 2000, 10);

        products.add(e1);
        products.add(c1);
        products.add(g1);

        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println(t.getTaxDetails());
            }

            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}
