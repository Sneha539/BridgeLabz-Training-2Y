import java.util.*;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Riya", "Aman", "Karan", "Neha", "Tina");
        Map<String, Integer> att = new HashMap<>();

        for(String s : students){
            att.put(s, 0);
        }

        List<List<String>> days = Arrays.asList(
                Arrays.asList("Riya","Aman","Karan"),
                Arrays.asList("Aman","Neha"),
                Arrays.asList("Riya","Tina"),
                Arrays.asList("Karan","Tina"),
                Arrays.asList("Riya","Aman","Neha"),
                Arrays.asList("Aman","Karan"),
                Arrays.asList("Riya","Neha"),
                Arrays.asList("Tina"),
                Arrays.asList("Aman","Tina"),
                Arrays.asList("Riya","Aman"),
                Arrays.asList("Neha"),
                Arrays.asList("Riya","Karan"),
                Arrays.asList("Karan","Tina"),
                Arrays.asList("Aman"),
                Arrays.asList("Riya","Neha")
        );

        for(List<String> day : days){
            for(String s : day){
                att.put(s, att.get(s) + 1);
            }
        }

        for(String s : att.keySet()){
            if(att.get(s) < 10){
                System.out.println(s + " : " + att.get(s));
            }
        }
    }
}
