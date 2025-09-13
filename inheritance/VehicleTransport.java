// Superclass Vehicle
class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.print("Car -> ");
        super.displayInfo();
        System.out.println("  Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    double cargoCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double cargoCapacity) {
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.print("Truck -> ");
        super.displayInfo();
        System.out.println("  Cargo Capacity: " + cargoCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    @Override
    public void displayInfo() {
        System.out.print("Motorcycle -> ");
        super.displayInfo();
    }
}


// Main class to demonstrate polymorphism
public class VehicleTransport {
    public static void main(String[] args) {
        // Create an array of Vehicle type
        Vehicle[] vehicles = new Vehicle[3];

        // Store objects of different subclasses in the array
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(150, "Petrol");

        System.out.println("Displaying Info for all vehicles in the array:");
        // Call displayInfo() on each object
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}