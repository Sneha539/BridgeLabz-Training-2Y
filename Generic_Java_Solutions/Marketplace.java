import java.util.List;

interface Category {}
class BookCategory implements Category {}
class ClothingCategory implements Category {}

class ProductGeneric<T extends Category> {
    private String name;
    private double price;
    public ProductGeneric(String name, double price){ this.name=name; this.price=price; }
    public double getPrice(){ return price; }
    public String toString(){ return name + " ("+price+")"; }
}

public class Marketplace {
    public static <T extends ProductGeneric<?>> void applyDiscount(T product, double percentage){
        // can't mutate price if it's private — in real system we'd expose setter; here demonstration:
        System.out.println("Applying " + percentage + "% discount to " + product);
        double discounted = product.getPrice() * (1 - percentage/100.0);
        System.out.println("Discounted price: " + discounted);
    }

    public static void main(String[] args){
        ProductGeneric<BookCategory> b = new ProductGeneric<>("Java Book", 50.0);
        ProductGeneric<ClothingCategory> c = new ProductGeneric<>("Jeans", 80.0);
        applyDiscount(b, 10.0);
        applyDiscount(c, 25.0);
    }
}
