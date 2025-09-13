// Superclass Person
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass Teacher extending Person
class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

// Subclass Student extending Person
class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student, Grade: " + grade);
    }
}

// Subclass Staff extending Person
class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff, Department: " + department);
    }
}

// Main class to test the school system hierarchy
public class SchoolSystem {
    public static void main(String[] args) {
        // Create objects of each subclass
        Teacher teacher = new Teacher("Mr. Smith", 45, "Mathematics");
        Student student = new Student("Alice", 15, 10);
        Staff staffMember = new Staff("Mrs. Davis", 38, "Administration");

        System.out.println("--- School Personnel Details ---");

        // Display details for the teacher
        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();

        // Display details for the student
        student.displayDetails();
        student.displayRole();
        System.out.println();

        // Display details for the staff member
        staffMember.displayDetails();
        staffMember.displayRole();
    }
}