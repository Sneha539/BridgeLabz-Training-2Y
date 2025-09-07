import java.util.Scanner;

public class nestedchar {

    // Method to find the frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();   // convert string to char array
        int[] freq = new int[chars.length];  // frequency array

        // find frequency using nested loops
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1; // initialize
            if (chars[i] == '0') {
                continue; // already counted
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        // prepare result array
        String[] result = new String[chars.length];
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') { // ignore spaces & marked
                result[count] = chars[i] + " : " + freq[i];
                count++;
            }
        }

        // shrink array to actual size
        String[] finalResult = new String[count];
        for (int i = 0; i < count; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // find frequency
        String[] frequency = findFrequency(text);

        // display result
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        for (String line : frequency) {
            System.out.println(line);
        }

        sc.close();
    }
}
