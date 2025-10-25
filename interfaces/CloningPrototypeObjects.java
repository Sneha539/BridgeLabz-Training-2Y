class Product implements Cloneable {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            return null;
        }
    }
}

public class CloningPrototypeObjects {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = (Product)p1.clone();
        System.out.println("Original: " + p1.name + " - " + p1.price);
        System.out.println("Clone: " + p2.name + " - " + p2.price);
    }
}
