import java.util.*;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {

        Map<Integer, String> emp = new HashMap<>();
        emp.put(101, "HR");
        emp.put(102, "Finance");
        emp.put(103, "IT");
        emp.put(104, "HR");
        emp.put(105, "Sales");
        emp.put(106, "IT");

        int id = 104;
        emp.put(id, "Finance");

        String dept = "IT";
        System.out.println("Employees in " + dept + ":");
        for(Integer e : emp.keySet()){
            if(emp.get(e).equals(dept)){
                System.out.println(e);
            }
        }

        Map<String, Integer> count = new HashMap<>();
        for(String d : emp.values()){
            count.put(d, count.getOrDefault(d, 0) + 1);
        }

        System.out.println("Employee count per department:");
        for(String d : count.keySet()){
            System.out.println(d + " : " + count.get(d));
        }
    }
}
