import java.util.Scanner;

public class friends {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return names[minAgeIndex];
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return names[maxHeightIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Friends' names
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages
        System.out.println("Enter the ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "'s age: ");
            ages[i] = scanner.nextInt();
        }

        // Input heights
        System.out.println("\nEnter the heights (in cm) of Amar, Akbar, and Anthony:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "'s height: ");
            heights[i] = scanner.nextDouble();
        }

        // Find youngest and tallest
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        // Display results
        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
