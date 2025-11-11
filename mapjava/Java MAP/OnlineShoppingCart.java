import java.util.*;

public class OnlineShoppingCart {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();
        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1200.0);
        cart.put("Bag", 900.0);
        cart.put("Headphones", 1500.0);

        for(String p : cart.keySet()){
            System.out.println(p + " : " + cart.get(p));
        }

        double total = 0;
        for(double v : cart.values()){
            total += v;
        }

        if(total > 5000){
            total = total - (total * 0.10);
        }
        System.out.println("Total bill: " + total);

        String removeItem = "Mouse";
        boolean qtyZero = true;
        if(qtyZero){
            cart.remove(removeItem);
        }

        System.out.println("Updated cart:");
        for(String p : cart.keySet()){
            System.out.println(p + " : " + cart.get(p));
        }
    }
}
