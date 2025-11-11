import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {

        Map<String, Double> emp = new HashMap<>();
        emp.put("Riya", 45000.0);
        emp.put("Aman", 52000.0);
        emp.put("Karan", 39000.0);
        emp.put("Neha", 61000.0);
        emp.put("Tina", 47000.0);
        emp.put("Sameer", 58000.0);

        String name = "Karan";
        if(emp.containsKey(name)){
            emp.put(name, emp.get(name) + emp.get(name)*0.10);
        } else {
            System.out.println("Employee not found");
        }

        name = "Tina";
        if(emp.containsKey(name)){
            emp.put(name, emp.get(name) + emp.get(name)*0.05);
        } else {
            System.out.println("Employee not found");
        }

        double sum = 0;
        for(String e : emp.keySet()){
            sum += emp.get(e);
        }
        double avg = sum / emp.size();
        System.out.println("Average salary: " + avg);

        double max = -1;
        for(double s : emp.values()){
            if(s > max) max = s;
        }

        System.out.println("Highest paid:");
        for(String e : emp.keySet()){
            if(emp.get(e) == max){
                System.out.println(e + " : " + emp.get(e));
            }
        }
    }
}
