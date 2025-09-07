import java.util.Scanner;

public class charfre {

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark counted
            }
        }

        // Reset frequencies for use
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)] = -freq[text.charAt(i)];
        }

        // Store characters and frequencies in 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; // prevent duplicate entry
                index++;
            }
        }

        return result;
    }

    // Method to display frequency table
    public static void displayFrequency(String[][] freqTable) {
        System.out.println("\nCharacter Frequency Table:");
        System.out.println("----------------------------");
        System.out.println("Char\tFrequency");
        System.out.println("----------------------------");

        for (int i = 0; i < freqTable.length; i++) {
            System.out.println(freqTable[i][0] + "\t" + freqTable[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find frequencies
        String[][] freqTable = findFrequency(text);

        // Display result
        displayFrequency(freqTable);

        sc.close();
    }
}
