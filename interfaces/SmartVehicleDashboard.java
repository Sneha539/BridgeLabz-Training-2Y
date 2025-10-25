interface Vehicle {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery feature not available");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car speed is 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric car speed is 70 km/h");
    }
    public void displayBattery() {
        System.out.println("Battery at 85%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new ElectricCar();
        v1.displaySpeed();
        v1.displayBattery();
        v2.displaySpeed();
        v2.displayBattery();
    }
}
