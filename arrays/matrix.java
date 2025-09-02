import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Error: Rows and columns must be positive integers.");
            sc.close();
            return;
        }

        // Create 2D array (matrix)
        int[][] matrix = new int[rows][cols];

        System.out.println("\nEnter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array of size rows * cols
        int[] array = new int[rows * cols];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display original matrix
        System.out.println("\n=== Matrix (2D Array) ===");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display copied 1D array
        System.out.println("\n=== Copied 1D Array ===");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
