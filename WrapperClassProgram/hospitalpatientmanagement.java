import java.util.ArrayList;
import java.util.List;

// Abstract class Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis; // sensitive data
    private List<String> medicalHistory = new ArrayList<>(); // sensitive data

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Encapsulation (controlled access)
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Protect medical history
    public void addToHistory(String record) {
        medicalHistory.add(record);
    }
    public List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory); // return copy for safety
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

// Interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient subclass
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        addToHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for In-Patient " + getName() + ": " + getMedicalHistory());
    }
}

// OutPatient subclass
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addToHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for Out-Patient " + getName() + ": " + getMedicalHistory());
    }
}

// Main Class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(101, "Aarav", 30, "Fever", 5, 2000);
        OutPatient p2 = new OutPatient(102, "Meera", 25, "Cough", 500);

        p1.addRecord("Admitted with high fever.");
        p1.addRecord("Prescribed antibiotics.");
        p2.addRecord("Visited for cough and cold.");
        p2.addRecord("Prescribed syrup.");

        patients.add(p1);
        patients.add(p2);

        // Polymorphism in action
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Diagnosis: " + p.getDiagnosis());
            System.out.println("Bill Amount: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println();
        }
    }
}
