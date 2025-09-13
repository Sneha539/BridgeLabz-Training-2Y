// Base class
class Course {
    String courseName;
    int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass extending Course
class OnlineCourse extends Course {
    String platform; // e.g., Coursera, Udemy
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass extending OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalPrice() {
        return fee * (1 - (discount / 100));
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + String.format("%.2f", fee));
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + String.format("%.2f", getFinalPrice()));
    }
}

// Main class to test the hierarchy
public class EducationalHierarchy {
    public static void main(String[] args) {
        // Create an object of the base class
        Course genericCourse = new Course("Introduction to World History", 50);

        // Create an object of the first subclass
        OnlineCourse freeOnlineCourse = new OnlineCourse("Beginner's Python", 30, "YouTube", true);

        // Create an object of the second subclass
        PaidOnlineCourse advancedPaidCourse = new PaidOnlineCourse("Advanced Data Science", 75, "Coursera", true, 299.99, 10);

        System.out.println("--- Generic Course Details ---");
        genericCourse.displayDetails();

        System.out.println("\n--- Free Online Course Details ---");
        freeOnlineCourse.displayDetails();

        System.out.println("\n--- Advanced Paid Online Course Details ---");
        advancedPaidCourse.displayDetails();
    }
}