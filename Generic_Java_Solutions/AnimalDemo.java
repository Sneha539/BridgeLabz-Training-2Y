import java.util.List;
import java.util.Arrays;

class Animal { String name; Animal(String n){name=n;} public String toString(){return name;} }
class Dog extends Animal { Dog(String n){super(n);} }
class Cat extends Animal { Cat(String n){super(n);} }

public class AnimalDemo {
    public static void printAnimals(List<? extends Animal> animals){
        for(Animal a: animals) System.out.println(a);
    }
    public static void main(String[] args){
        printAnimals(Arrays.asList(new Dog("Rex"), new Dog("Buddy")));
        printAnimals(Arrays.asList(new Cat("Mittens"), new Cat("Luna")));
    }
}
