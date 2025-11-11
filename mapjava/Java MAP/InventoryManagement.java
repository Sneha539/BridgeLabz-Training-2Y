import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        stock.put("Soap", 30);
        stock.put("Shampoo", 12);
        stock.put("Bread", 5);
        stock.put("Milk", 20);

        stock.put("Bread", stock.get("Bread") - 5);
        if(stock.get("Bread") <= 0) stock.put("Bread", 0);

        stock.put("Soap", stock.get("Soap") - 40);
        if(stock.get("Soap") <= 0) stock.put("Soap", 0);

        stock.put("Milk", stock.get("Milk") + 15);

        String query = "Shampoo";
        if(stock.containsKey(query)){
            System.out.println(query + " remaining: " + stock.get(query));
        } else {
            System.out.println("not stocked");
        }

        System.out.println("Out of stock:");
        for(String p : stock.keySet()){
            if(stock.get(p) == 0){
                System.out.println(p);
            }
        }
    }
}
