// Base class Employee
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Role: Manager, Team Size: " + teamSize);
    }
}

// Subclass Developer
class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Role: Developer, Language: " + programmingLanguage);
    }
}

// Subclass Intern
class Intern extends Employee {
    public Intern(String name, int id, double salary) {
        super(name, id, salary);
    }

     @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Role: Intern");
    }
}

// Main class to test the system
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 101, 90000, 10);
        Developer dev = new Developer("Bob", 202, 75000, "Java");
        Intern intern = new Intern("Charlie", 303, 30000);

        System.out.println("Employee Details:");
        mgr.displayDetails();
        dev.displayDetails();
        intern.displayDetails();
    }
}