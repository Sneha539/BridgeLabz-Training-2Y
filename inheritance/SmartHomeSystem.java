// Superclass Device
class Device {
    String deviceId;
    String status; // e.g., "On", "Off", "Standby"

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass Thermostat extending Device
class Thermostat extends Device {
    double temperatureSetting; // in Celsius

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        // Call the constructor of the superclass (Device)
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override the displayStatus method to include thermostat-specific info
    @Override
    public void displayStatus() {
        System.out.print("Thermostat -> ");
        super.displayStatus(); // Reuse the superclass method
        System.out.println("  Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the smart home device hierarchy
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a generic device object
        Device smartLight = new Device("LGT-001", "On");
        
        // Create a specific thermostat object
        Thermostat thermostat = new Thermostat("THR-101", "On", 21.5);

        System.out.println("Smart Home Device Status:");
        
        // Display status for the generic device
        smartLight.displayStatus();
        
        // Display status for the thermostat
        thermostat.displayStatus();
    }
}