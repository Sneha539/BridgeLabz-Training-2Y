import java.util.ArrayList;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm);
    }
}

// Interface GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car subclass
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // extra charge for car
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Bike subclass
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no extra charge
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Auto subclass
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // small extra charge
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Main class
public class RideHailingApp {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car1 = new Car("CAR101", "Aarohi", 15, "City Center");
        Bike bike1 = new Bike("BIKE202", "Divyam", 10, "Station Road");
        Auto auto1 = new Auto("AUTO303", "Kavya", 12, "Main Street");

        vehicles.add(car1);
        vehicles.add(bike1);
        vehicles.add(auto1);

        double distance = 10; // 10 km ride

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            System.out.println();
        }
    }
}
