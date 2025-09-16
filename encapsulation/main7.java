abstract class Patient {
    String name;
    int age;
    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract double calculateBill();
}

class InPatient extends Patient {
    InPatient(String name, int age) {
        super(name, age);
    }
    double calculateBill() {
        return 5000;
    }
}

class OutPatient extends Patient {
    OutPatient(String name, int age) {
        super(name, age);
    }
    double calculateBill() {
        return 1000;
    }
}

public class main7 {
    public static void main(String[] args) {
        Patient p1 = new InPatient("Alice", 30);
        Patient p2 = new OutPatient("Bob", 25);
        System.out.println(p1.name + " Bill: " + p1.calculateBill());
        System.out.println(p2.name + " Bill: " + p2.calculateBill());
    }
}