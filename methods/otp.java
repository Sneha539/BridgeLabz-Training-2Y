import java.util.Scanner;

public class otp {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() generates value between 0.0 and 1.0
        // multiply by 900000 to get range 0 - 899999, then add 100000 to make it 6 digits
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Validate uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
