import java.util.Scanner;

public class lowercompare {

    // Method to convert text to lowercase manually using ASCII values
    public static String manualToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // if uppercase (A–Z), convert by adding 32
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
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

        // Take complete text input (with spaces if any)
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Manual conversion
        String manualLower = manualToLower(text);

        // Built-in conversion
        String builtInLower = text.toLowerCase();

        // Compare both results
        boolean isSame = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nManual Lowercase:   " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("\nComparison result: " + isSame);

        sc.close();
    }
}
