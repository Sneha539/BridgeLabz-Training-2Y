import java.util.ArrayList;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rate: " + rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // 10% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + policyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8; // 20% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + policyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // fixed extra charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2; // 20% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + policyNumber;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car1 = new Car("CAR123", 2000, "CAR-POL-101");
        Bike bike1 = new Bike("BIKE456", 500, "BIKE-POL-202");
        Truck truck1 = new Truck("TRUCK789", 5000, "TRUCK-POL-303");

        vehicles.add(car1);
        vehicles.add(bike1);
        vehicles.add(truck1);

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rentalCost = v.calculateRentalCost(5);
            System.out.println("Rental Cost (5 days): " + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
            }

            System.out.println();
        }
    }
}
