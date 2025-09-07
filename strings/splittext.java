import java.util.Scanner;

public class splittext {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    // Method to split text into words manually using charAt()
    public static String[] splitText(String text) {
        int n = findLength(text);

        // Count words (words = spaces + 1)
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

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Custom split
        String[] manualSplit = splitText(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        // Compare arrays
        boolean isSame = compareArrays(manualSplit, builtInSplit);

        // Display results
        System.out.println("\nManual split result:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nComparison result: " + isSame);

        sc.close();
    }
}
