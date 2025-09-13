// This is my Patient class for a hospital record system.
// I'm practicing core Java concepts: static, this, final, and instanceof.

public class Patient {

    // --- STATIC Members ---
    // A static variable is shared by all patient objects.
    // This is perfect for the hospital name, which is the same for everyone.
    static String hospitalName = "City Central Hospital";
    
    // This static counter will track the total number of patients admitted.
    private static int totalPatients = 0;


    // --- INSTANCE Members ---
    // These variables are specific to each individual patient.
    String name;
    int age;
    String ailment;

    // The 'final' keyword ensures the patientID cannot be changed once assigned.
    // This is important for a unique identifier.
    final String patientID;


    // --- CONSTRUCTOR ---
    // This method is called when we create a new Patient object, like `new Patient(...)`.
    public Patient(String name, int age, String ailment, String patientID) {
        // I'm using 'this' to make it clear that I'm setting the instance variables
        // of this specific object, distinguishing them from the constructor's parameters.
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        // Every time a new patient is created, we increment our static counter.
        totalPatients++;
        System.out.println("New patient admitted: " + this.name + " (ID: " + this.patientID + ")");
    }


    // --- METHODS ---

    // A static method belongs to the class itself, not to an individual object.
    // We can use it to get the total count of patients in the hospital.
    public static void displayTotalPatients() {
        System.out.println("\n------------------------------------");
        System.out.println("Total Patients at " + hospitalName + ": " + totalPatients);
        System.out.println("------------------------------------");
    }

    // This method prints the details for a single patient instance.
    public void displayPatientDetails() {
        System.out.println("\n--- Patient Chart ---");
        System.out.println("Hospital: " + hospitalName); // Accessing the static variable
        System.out.println("Patient Name: " + this.name);
        System.out.println("Patient ID: " + this.patientID);
        System.out.println("Age: " + this.age);
        System.out.println("Ailment: " + this.ailment);
        System.out.println("---------------------");
    }


    // --- MAIN Method for Testing ---
    // My program will start running from here. I'll use it to test my class.
    public static void main(String[] args) {
        System.out.println("Starting Hospital Patient Management System...");
        
        // Let's see the patient count before admitting anyone.
        Patient.displayTotalPatients();

        // Let's admit a few patients by creating new objects.
        Patient p1 = new Patient("Amit Verma", 45, "Fever and Cough", "CCH-001");
        Patient p2 = new Patient("Sunita Rao", 32, "Fractured Arm", "CCH-002");

        // Now, let's check the total count again. It should be 2.
        Patient.displayTotalPatients();

        // Here, I'm using 'instanceof' to check if an object is actually a Patient.
        // This is a good safety check before trying to access patient-specific data.
        System.out.println("\nVerifying patient records...");
        
        if (p1 instanceof Patient) {
            System.out.println("Record p1 is a valid Patient. Displaying details.");
            p1.displayPatientDetails();
        }

        if (p2 instanceof Patient) {
            System.out.println("Record p2 is a valid Patient. Displaying details.");
            p2.displayPatientDetails();
        }
        
        // This is a test to show the 'final' keyword works.
        // If I try to uncomment the line below, my code will fail to compile
        // because a patient's ID should never change.
        // p1.patientID = "CCH-999"; // This will cause a compilation error.
        System.out.println("\nReminder: The Patient ID is a 'final' value and cannot be modified.");
    }
}