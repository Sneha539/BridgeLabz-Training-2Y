// This is my Student class for a student management system.
// I'm using it to practice static, this, final, and instanceof in Java.

public class Student {

    // --- STATIC Members ---
    // A static variable is shared across all objects of the class.
    // So, the university name will be the same for every student.
    static String universityName = "Agra University";

    // This static counter keeps track of how many students have been created.
    private static int totalStudents = 0;


    // --- INSTANCE Members ---
    // These variables are unique for each student object.
    String name;
    String grade;

    // The 'final' keyword makes the roll number unchangeable once it's set.
    // This is good because a student's roll number shouldn't change.
    final int rollNumber;


    // --- CONSTRUCTOR ---
    // The constructor is called when we create a new Student object.
    public Student(String name, int rollNumber, String grade) {
        // 'this' is used to refer to the current object's instance variables
        // and distinguish them from the parameters passed to the constructor.
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        // Every time a new student is created, we increase our static counter.
        totalStudents++;
        System.out.println("New student record created for: " + this.name);
    }


    // --- METHODS ---

    // This is a static method. It belongs to the class, not to any single object.
    // We can call it using the class name, like Student.displayTotalStudents().
    public static void displayTotalStudents() {
        System.out.println("------------------------------------");
        System.out.println("Total Students Enrolled at " + universityName + ": " + totalStudents);
        System.out.println("------------------------------------");
    }

    // This method prints the details for a specific student instance.
    public void displayStudentDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("University: " + universityName); // Accessing the static variable
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Grade: " + this.grade);
        System.out.println("-----------------------");
    }


    // --- MAIN Method for Testing ---
    // The program starts running from here. I'll use it to test my class.
    public static void main(String[] args) {
        System.out.println("Starting Student Management System...");

        // Let's check the total students before we add anyone.
        Student.displayTotalStudents();

        // Now, let's create a few student objects.
        Student student1 = new Student("Rohan Sharma", 1201, "A+");
        Student student2 = new Student("Anjali Gupta", 1202, "B");

        // Let's check the total count again. It should be 2 now.
        Student.displayTotalStudents();

        // Now I'll use 'instanceof' to make sure my objects are actually Students
        // before I try to print their details. It's a good safety check.
        System.out.println("\nVerifying student records...");

        if (student1 instanceof Student) {
            System.out.println("Record 'student1' is a valid Student. Displaying details.");
            student1.displayStudentDetails();
        } else {
            System.out.println("Error: 'student1' is not a valid Student record.");
        }

        if (student2 instanceof Student) {
            System.out.println("Record 'student2' is a valid Student. Displaying details.");
            student2.displayStudentDetails();
        } else {
            System.out.println("Error: 'student2' is not a valid Student record.");
        }

        // This is to show that the 'final' variable 'rollNumber' cannot be changed.
        // If you uncomment the line below, the program won't compile.
        // student1.rollNumber = 1300; // This will cause a compilation error.
        System.out.println("\nNote: The student Roll Number is 'final' and cannot be modified after creation.");
    }
}