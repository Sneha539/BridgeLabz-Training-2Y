import java.util.Scanner;

public class shortlongword {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // reached end
        }
        return count;
    }

    // Method to split text into words manually using charAt()
    public static String[] splitText(String text) {
        int n = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                words[index] = text.substring(start, i);
                index++;
                start = i + 1;
            }
        }
        // last word
        words[index] = text.substring(start, n);

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word
    // Returns int array of indexes: [shortestIndex, longestIndex]
    public static int[] findShortestLongest(String[][] table) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[] {minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Process
        String[] words = splitText(text);
        String[][] table = wordWithLength(words);
        int[] result = findShortestLongest(table);

        // Display all words with lengths
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        // Display shortest and longest
        System.out.println("\nShortest word: " + table[result[0]][0] + " (Length " + table[result[0]][1] + ")");
        System.out.println("Longest word: " + table[result[1]][0] + " (Length " + table[result[1]][1] + ")");

        sc.close();
    }
}
