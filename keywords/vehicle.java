// This is my Vehicle class for a registration system.
// I'm practicing Java concepts: static, this, final, and instanceof.

public class Vehicle {

    // --- STATIC Members ---
    // A static variable is shared by all objects (instances) of the class.
    // This is useful for something like a registration fee that is the same for all vehicles.
    static double registrationFee = 150.00;

    // --- INSTANCE Members ---
    // These variables are unique for each specific vehicle object.
    String ownerName;
    String vehicleType; // e.g., "Car", "Motorcycle"

    // The 'final' keyword means the registrationNumber can't be changed after it's set.
    // This is great for a unique and permanent ID.
    final String registrationNumber;


    // --- CONSTRUCTOR ---
    // This method is called whenever we create a new Vehicle object.
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        // I'm using 'this' to differentiate between the instance variables
        // (like this.ownerName) and the parameters with the same name.
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        System.out.println("New vehicle registered: " + this.registrationNumber + " for " + this.ownerName);
    }


    // --- METHODS ---

    // This is a static method. It belongs to the Vehicle class as a whole.
    // We can use it to update the fee for everyone at once.
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
            System.out.println("\n!!! Universal Registration Fee updated to $" + String.format("%.2f", registrationFee) + " !!!");
        } else {
            System.out.println("Invalid fee amount. Must be greater than 0.");
        }
    }

    // This method prints the details for one specific vehicle instance.
    public void displayVehicleDetails() {
        System.out.println("\n--- Vehicle Registration Details ---");
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Number: " + this.registrationNumber);
        // We can access the static variable from an instance method too.
        System.out.println("Current Registration Fee: $" + String.format("%.2f", registrationFee));
        System.out.println("----------------------------------");
    }


    // --- MAIN Method for Testing ---
    // My program starts here. I'll use this to test my Vehicle class.
    public static void main(String[] args) {
        System.out.println("Starting Vehicle Registration System...");
        System.out.println("Current registration fee for all vehicles: $" + Vehicle.registrationFee);

        // Let's register a couple of vehicles.
        Vehicle car = new Vehicle("Sanjay Kumar", "Car", "UP80-AB-1234");
        Vehicle bike = new Vehicle("Meera Devi", "Motorcycle", "UP80-CD-5678");

        // Now, I'll use 'instanceof' to check if my object is a real Vehicle
        // before trying to display its details. It helps avoid errors.
        System.out.println("\nVerifying registered vehicles...");

        if (car instanceof Vehicle) {
            System.out.println("Object 'car' is a valid Vehicle. Displaying details.");
            car.displayVehicleDetails();
        }

        // Let's pretend the government changed the registration fee.
        // We'll call the static method to update it for all vehicles.
        Vehicle.updateRegistrationFee(175.50);

        // Now, let's display the details for both vehicles again.
        // The fee should be updated for both of them.
        System.out.println("\nDisplaying details after fee update...");
        if (car instanceof Vehicle) {
            car.displayVehicleDetails();
        }
        if (bike instanceof Vehicle) {
            bike.displayVehicleDetails();
        }

        // This demonstrates that the 'final' registration number cannot be changed.
        // If you try to uncomment the line below, the code will not compile.
        // car.registrationNumber = "UP80-XX-9999"; // This will cause a compilation error.
        System.out.println("\nReminder: The vehicle Registration Number is 'final' and cannot be modified.");
    }
}