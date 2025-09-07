import java.util.Scanner;

public class anagram {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {
        // if lengths are not equal → not an anagram
        if (text1.length() != text2.length()) {
            return false;
        }

        // arrays to hold frequency of ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // calculate frequency of characters in text1
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }

        // calculate frequency of characters in text2
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }

        // compare the two frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take inputs
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // check anagram
        boolean result = isAnagram(text1, text2);

        // display result
        System.out.println("\nAnagram Check Result:");
        System.out.println("----------------------");
        if (result) {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are Anagrams.");
        } else {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are NOT Anagrams.");
        }

        sc.close();
    }
}
