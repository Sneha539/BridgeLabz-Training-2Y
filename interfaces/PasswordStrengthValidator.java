interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") 
               && password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*].*");
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String pass = "Hello@123";
        if (SecurityUtils.isStrongPassword(pass))
            System.out.println("Strong password");
        else
            System.out.println("Weak password");
    }
}
