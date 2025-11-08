import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem { String name; WarehouseItem(String n){name=n;} public String toString(){return name;} }
class ElectronicsItem extends WarehouseItem { ElectronicsItem(String n){super(n);} }
class GroceryItem extends WarehouseItem { GroceryItem(String n){super(n);} }
class FurnitureItem extends WarehouseItem { FurnitureItem(String n){super(n);} }

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void add(T it){ items.add(it); }
    public List<T> getAll(){ return items; }
}

public class WarehouseSystem {
    public static void displayAll(List<? extends WarehouseItem> list){
        for(WarehouseItem w: list) System.out.println(w);
    }
    public static void main(String[] args){
        Storage<ElectronicsItem> s1 = new Storage<>();
        s1.add(new ElectronicsItem("TV"));
        s1.add(new ElectronicsItem("Speaker"));

        Storage<GroceryItem> s2 = new Storage<>();
        s2.add(new GroceryItem("Rice"));

        System.out.println("Electronics storage:");
        displayAll(s1.getAll());
        System.out.println("Grocery storage:");
        displayAll(s2.getAll());
    }
}
