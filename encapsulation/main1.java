abstract class Employee {
    String name;
    double baseSalary;
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    abstract double calculateSalary();
    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    double calculateSalary() {
        return baseSalary * 12;
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    double calculateSalary() {
        return baseSalary * 6;
    }
}

class Department {
    String deptName;
    Employee[] employees;
    Department(String deptName, Employee[] employees) {
        this.deptName = deptName;
        this.employees = employees;
    }
    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for(Employee e : employees) {
            e.displayDetails();
        }
    }
}

public class main1 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice", 5000);
        Employee e2 = new PartTimeEmployee("Bob", 3000);
        Department d = new Department("HR", new Employee[]{e1, e2});
        d.displayDepartment();
    }
}