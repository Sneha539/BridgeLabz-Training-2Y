// Superclass
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties(); // public and abstract by default
}

// Subclass 1 implementing the interface
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking delicious food.");
    }
}

// Subclass 2 implementing the interface
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is taking orders and serving tables.");
    }
}

// Main class to test the hybrid structure
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon", 101);
        Waiter waiter = new Waiter("James", 202);

        System.out.println("Restaurant Staff Duties:");
        chef.performDuties();
        waiter.performDuties();
    }
}