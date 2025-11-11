import java.util.*;
class Employee {
    String name;
    String dept;
    Employee(String n, String d){
        name = n; dept = d;
    }
    public String toString(){
        return name;
    }
}

public class Q5 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Riya","IT"));
        list.add(new Employee("Aman","HR"));
        list.add(new Employee("Karan","IT"));

        Map<String, List<Employee>> map = new HashMap<>();
        for(Employee e : list){
            if(!map.containsKey(e.dept)) map.put(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }
        System.out.println(map);
    }
}
