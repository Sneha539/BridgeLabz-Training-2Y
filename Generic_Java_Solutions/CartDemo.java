import java.util.ArrayList;
import java.util.List;

class Electronics { String name; Electronics(String n){name=n;} public String toString(){return name;} }
class Clothing { String name; Clothing(String n){name=n;} public String toString(){return name;} }

public class Cart<T> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item){ items.add(item); }
    public void removeItem(T item){ items.remove(item); }
    public void displayItems(){ for(T it: items) System.out.println(it); }

    public static void main(String[] args){
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics("Phone"));
        eCart.addItem(new Electronics("Headphones"));
        System.out.println("Electronics Cart:"); eCart.displayItems();

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing("T-Shirt"));
        System.out.println("Clothing Cart:"); cCart.displayItems();
    }
}
