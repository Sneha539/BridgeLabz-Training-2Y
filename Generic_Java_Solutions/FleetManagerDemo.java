import java.util.ArrayList;
import java.util.List;

class Vehicle { String id; Vehicle(String id){this.id=id;} public String toString(){return id;} }
class Truck extends Vehicle { Truck(String id){super(id);} }
class Bike extends Vehicle { Bike(String id){super(id);} }

public class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();
    public void addVehicle(T v){ fleet.add(v); }
    public void showFleet(){ for(T v: fleet) System.out.println(v); }

    public static void main(String[] args){
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck("Truck-01"));
        trucks.addVehicle(new Truck("Truck-02"));
        System.out.println("Truck fleet:"); trucks.showFleet();

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike("Bike-A")); System.out.println("Bike fleet:"); bikes.showFleet();
    }
}
