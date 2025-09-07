import java.util.Scanner;

public class charcompare {

    // User-defined method to convert String into char array
    public static char[] getChars(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method to compare two char arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
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

        // Convert using user-defined method
        char[] userChars = getChars(text);

        // Convert using built-in method
        char[] builtInChars = text.toCharArray();

        // Compare both arrays
        boolean areEqual = compareArrays(userChars, builtInChars);

        // Display results
        System.out.print("\nUser-defined char array: ");
        for (char c : userChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in toCharArray:   ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nComparison Result: " + areEqual);

        if (areEqual) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println("❌ Arrays are different.");
        }

        sc.close();
    }
}
