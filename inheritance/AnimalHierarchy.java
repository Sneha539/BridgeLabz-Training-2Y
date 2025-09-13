// Superclass
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); // Call the superclass constructor
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

// Subclass Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The bird chirps: Tweet! Tweet!");
    }
}

// Main class to test the hierarchy
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal", 5);
        Dog myDog = new Dog("Buddy", 3);
        Cat myCat = new Cat("Whiskers", 2);
        Bird myBird = new Bird("Polly", 1);

        System.out.println("Demonstrating makeSound():");
        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
        myBird.makeSound();
    }
}