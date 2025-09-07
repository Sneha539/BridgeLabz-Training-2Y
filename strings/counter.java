import java.util.Scanner;

public class counter {

    // Method to check if a character is vowel, consonant, or not a letter
    public static String checkChar(char ch) {
        // Convert uppercase to lowercase using ASCII difference
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // convert to lowercase
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkChar(ch);

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsConsonants(input);

        // Display result
        System.out.println("\nVowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}
