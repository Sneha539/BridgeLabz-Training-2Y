import java.io.*;

class Employee implements Serializable {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class DataSerializationForBackup {
    public static void main(String[] args) {
        Employee e = new Employee("Kritika", 101);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.ser"));
            out.writeObject(e);
            out.close();
            System.out.println("Backup created");
        } catch (Exception ex) {
            System.out.println("Error in backup");
        }
    }
}
