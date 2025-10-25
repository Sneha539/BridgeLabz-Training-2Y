interface SensitiveData {}

class UserData implements SensitiveData {
    String username;
    String password;
    UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        UserData u = new UserData("kritika", "abc@123");
        if (u instanceof SensitiveData)
            System.out.println("Sensitive data detected, encrypting...");
        else
            System.out.println("Normal data");
    }
}
