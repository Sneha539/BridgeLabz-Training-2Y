import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        grades.put("Riya", 85.0);
        grades.put("Aman", 92.5);
        grades.put("Karan", 76.0);
        grades.put("Neha", 88.0);

        grades.put("Karan", 82.0);

        grades.remove("Neha");

        TreeMap<String, Double> sorted = new TreeMap<>(grades);

        for(String name : sorted.keySet()){
            System.out.println(name + " : " + sorted.get(name));
        }
    }
}
