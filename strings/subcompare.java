import java.util.Scanner;

public class subcompare {

    // Method to create substring manually using charAt()
    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
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

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using charAt()
        String manualSub = manualSubstring(text, start, end);

        // Substring using built-in method
        String builtInSub = text.substring(start, end);

        // Compare substrings
        boolean manualCompare = compareStrings(manualSub, builtInSub);
        boolean equalsCompare = manualSub.equals(builtInSub);

        // Display results
        System.out.println("\nManual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);

        System.out.println("\nComparison using charAt(): " + manualCompare);
        System.out.println("Comparison using equals(): " + equalsCompare);

        if (manualCompare && equalsCompare) {
            System.out.println("✅ Both substrings match correctly.");
        } else {
            System.out.println("❌ Substrings do not match.");
        }

        sc.close();
    }
}
