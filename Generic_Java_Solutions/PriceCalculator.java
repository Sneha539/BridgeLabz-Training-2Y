import java.util.List;
import java.util.Arrays;

class Product { private double price; public Product(double p){price=p;} public double getPrice(){return price;} }
class Mobile extends Product { public Mobile(double p){super(p);} }
class Laptop extends Product { public Laptop(double p){super(p);} }

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items){
        double total = 0.0;
        for(Product p: items) total += p.getPrice();
        return total;
    }
    public static void main(String[] args){
        System.out.println(calculateTotal(Arrays.asList(new Mobile(199.99), new Mobile(299.0))));
        System.out.println(calculateTotal(Arrays.asList(new Laptop(899.0), new Laptop(1200.5))));
    }
}
