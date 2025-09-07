import java.util.Scanner;

public class charunique {

    // Method to find unique characters in the string
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // check if already present in temp
            for (int j = 0; j < count; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = current;
                count++;
            }
        }

        // copy only unique chars into final array
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];  // ASCII array

        // count frequency of each char
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // get unique chars
        char[] unique = uniqueCharacters(text);

        // create result array
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    // Method to display frequency table
    public static void display(String[][] freqTable) {
        System.out.println("\nCharacter Frequency Table:");
        System.out.println("----------------------------");
        System.out.println("Char\tFrequency");
        System.out.println("----------------------------");

        for (int i = 0; i < freqTable.length; i++) {
            System.out.println(freqTable[i][0] + "\t" + freqTable[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // find frequencies
        String[][] freqTable = findFrequency(text);

        // display result
        display(freqTable);

        sc.close();
    }
}
