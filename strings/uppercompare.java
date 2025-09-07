import java.util.Scanner;

public class uppercompare {

    // Method to convert text to uppercase manually using ASCII values
    public static String manualToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // if lowercase (a–z), convert by subtracting 32
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take complete text input (can include spaces)
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Manual conversion
        String manualUpper = manualToUpper(text);

        // Built-in conversion
        String builtInUpper = text.toUpperCase();

        // Compare results
        boolean isSame = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual Uppercase:   " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("\nComparison result: " + isSame);

        sc.close();
    }
}
