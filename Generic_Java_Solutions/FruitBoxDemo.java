import java.util.ArrayList;
import java.util.List;

class Fruit { public String name; public Fruit(String n){name=n;} public String toString(){return name;} }
class Apple extends Fruit { public Apple(){super("Apple");} }
class Mango extends Fruit { public Mango(){super("Mango");} }
// Non-fruit example: class Car {}

public class FruitBox<T extends Fruit> {
    private List<T> list = new ArrayList<>();
    public void add(T f){ list.add(f); }
    public void display(){ for(T f: list) System.out.println(f); }

    public static void main(String[] args){
        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple());
        apples.add(new Apple());
        System.out.println("Apples in box:");
        apples.display();

        FruitBox<Fruit> fruits = new FruitBox<>();
        fruits.add(new Mango());
        fruits.add(new Apple());
        System.out.println("Fruits in box:");
        fruits.display();

        // FruitBox<Car> carBox = new FruitBox<>(); // won't compile - Car not a Fruit
    }
}
