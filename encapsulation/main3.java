abstract class Vehicle {
    String number;
    Vehicle(String number) {
        this.number = number;
    }
    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    Car(String number) {
        super(number);
    }
    double calculateRentalCost(int days) {
        return days * 1000;
    }
}

class Bike extends Vehicle {
    Bike(String number) {
        super(number);
    }
    double calculateRentalCost(int days) {
        return days * 500;
    }
}

class Truck extends Vehicle {
    Truck(String number) {
        super(number);
    }
    double calculateRentalCost(int days) {
        return days * 2000;
    }
}

public class main3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C123");
        Vehicle v2 = new Bike("B456");
        Vehicle v3 = new Truck("T789");
        System.out.println("Car Rent: " + v1.calculateRentalCost(5));
        System.out.println("Bike Rent: " + v2.calculateRentalCost(5));
        System.out.println("Truck Rent: " + v3.calculateRentalCost(5));
    }
}