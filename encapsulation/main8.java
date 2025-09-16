abstract class Vehicle {
    String id, driverName;
    Vehicle(String id, String driverName) {
        this.id = id;
        this.driverName = driverName;
    }
    abstract double calculateFare(double distance);
}

class Bike extends Vehicle {
    Bike(String id, String driverName) {
        super(id, driverName);
    }
    double calculateFare(double distance) {
        return distance * 10;
    }
}

class Auto extends Vehicle {
    Auto(String id, String driverName) {
        super(id, driverName);
    }
    double calculateFare(double distance) {
        return distance * 15;
    }
}

class Car extends Vehicle {
    Car(String id, String driverName) {
        super(id, driverName);
    }
    double calculateFare(double distance) {
        return distance * 20;
    }
}

public class main8 {
    public static void main(String[] args) {
        Vehicle v1 = new Bike("B101", "Ram");
        Vehicle v2 = new Auto("A202", "Shyam");
        Vehicle v3 = new Car("C303", "Mohan");
        System.out.println("Bike Fare: " + v1.calculateFare(10));
        System.out.println("Auto Fare: " + v2.calculateFare(10));
        System.out.println("Car Fare: " + v3.calculateFare(10));
    }
}