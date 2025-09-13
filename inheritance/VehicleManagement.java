// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel(); // An abstract method
}

// Subclass ElectricVehicle inheriting from Vehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is now charging.");
    }
}

// Subclass PetrolVehicle inheriting from Vehicle and implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is now refueling with petrol.");
    }
}

// Main class to demonstrate hybrid inheritance
public class VehicleManagement {
    public static void main(String[] args) {
        // Create an electric vehicle object
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250);
        
        // Create a petrol vehicle object
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 200);

        System.out.println("--- Vehicle Details and Actions ---");

        // Demonstrate ElectricVehicle
        tesla.displayInfo();
        tesla.charge();
        System.out.println();

        // Demonstrate PetrolVehicle
        honda.displayInfo();
        honda.refuel();
    }
}