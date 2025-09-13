// This is my Employee class for a company management system.
// I'm using it to practice static, this, final, and instanceof in Java.

public class Employee {

    // --- STATIC Members ---
    // A static variable is shared by all objects of the class.
    // So, the company name will be the same for every employee.
    static String companyName = "Agra Software Solutions";

    // This static counter will keep track of how many employees we've created.
    private static int totalEmployees = 0;


    // --- INSTANCE Members ---
    // These variables are unique for each employee object.
    String name;
    String designation;

    // The 'final' keyword makes the employee ID unchangeable once it's set.
    // This is good because an employee's ID should not change.
    final int id;


    // --- CONSTRUCTOR ---
    // The constructor is called whenever we create a new Employee object.
    public Employee(String name, int id, String designation) {
        // 'this' is used here to distinguish between the instance variables
        // (like this.name) and the parameters passed to the constructor (like name).
        this.name = name;
        this.id = id;
        this.designation = designation;

        // Every time a new employee is created, we increment our static counter.
        totalEmployees++;
        System.out.println("New employee record created for: " + this.name);
    }


    // --- METHODS ---

    // This is a static method. It belongs to the class, not to any one object.
    // We can call it using the class name, like Employee.displayTotalEmployees().
    public static void displayTotalEmployees() {
        System.out.println("------------------------------------");
        System.out.println("Total Employees at " + companyName + ": " + totalEmployees);
        System.out.println("------------------------------------");
    }

    // This method prints the details for a specific employee instance.
    public void displayEmployeeDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Company: " + companyName); // Accessing the static variable
        System.out.println("Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Designation: " + this.designation);
        System.out.println("------------------------");
    }


    // --- MAIN Method for Testing ---
    // The program starts running from here. I'll use it to test my class.
    public static void main(String[] args) {
        System.out.println("Starting Employee Management System...");

        // Let's check the total employees before we add anyone.
        Employee.displayTotalEmployees();

        // Now, let's create a few employee objects.
        Employee emp1 = new Employee("Amit Singh", 101, "Software Developer");
        Employee emp2 = new Employee("Priya Verma", 102, "Project Manager");

        // Let's check the total count again.
        Employee.displayTotalEmployees();

        // Now I'll use 'instanceof' to make sure my objects are actually Employees
        // before I try to print their details. It's a safety check.
        System.out.println("\nVerifying object types...");

        if (emp1 instanceof Employee) {
            System.out.println("Object 'emp1' is an Employee. Printing details.");
            emp1.displayEmployeeDetails();
        } else {
            System.out.println("Error: 'emp1' is not a valid Employee object.");
        }

        if (emp2 instanceof Employee) {
            System.out.println("Object 'emp2' is an Employee. Printing details.");
            emp2.displayEmployeeDetails();
        } else {
            System.out.println("Error: 'emp2' is not a valid Employee object.");
        }
        
        // This is a test to show the 'final' keyword in action.
        // If you try to uncomment the line below, the program won't compile
        // because an employee's ID cannot be changed.
        // emp1.id = 205; // This will cause a compilation error.
        System.out.println("\nNote: The Employee ID is a 'final' value and cannot be modified.");
    }
}