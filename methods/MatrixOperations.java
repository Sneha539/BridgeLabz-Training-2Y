import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== Matrix Operations ===");
        System.out.print("Enter matrix size (2 or 3): ");
        int size = scanner.nextInt();
        
        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 and 3x3 matrices supported!");
            return;
        }
        
        // Create random matrix
        int[][] matrix = createRandomMatrix(size, size, random);
        
        System.out.println("\nOriginal Matrix:");
        showMatrix(matrix);
        
        // Transpose
        int[][] transpose = findTranspose(matrix);
        System.out.println("\nTranspose:");
        showMatrix(transpose);
        
        // Determinant
        double det = findDeterminant(matrix);
        System.out.printf("\nDeterminant: %.1f\n", det);
        
        // Inverse (if possible)
        if (det != 0) {
            double[][] inverse = findInverse(matrix, det);
            System.out.println("\nInverse:");
            showDoubleMatrix(inverse);
        } else {
            System.out.println("\nMatrix is singular - no inverse exists!");
        }
        
        scanner.close();
    }
    
    // Create random matrix
    public static int[][] createRandomMatrix(int rows, int cols, Random rand) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // 0-9
            }
        }
        return matrix;
    }
    
    // Display matrix
    public static void showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
    
    // Display double matrix
    public static void showDoubleMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }
    
    // Find transpose
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    
    // Find determinant
    public static double findDeterminant(int[][] matrix) {
        int size = matrix.length;
        if (size == 2) {
            return find2x2Determinant(matrix);
        } else if (size == 3) {
            return find3x3Determinant(matrix);
        }
        return 0;
    }
    
    // 2x2 determinant
    public static double find2x2Determinant(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    
    // 3x3 determinant
    public static double find3x3Determinant(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    
    // Find inverse
    public static double[][] findInverse(int[][] matrix, double det) {
        int size = matrix.length;
        if (size == 2) {
            return find2x2Inverse(matrix, det);
        } else if (size == 3) {
            return find3x3Inverse(matrix, det);
        }
        return new double[0][0];
    }
    
    // 2x2 inverse
    public static double[][] find2x2Inverse(int[][] matrix, double det) {
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }
    
    // 3x3 inverse
    public static double[][] find3x3Inverse(int[][] matrix, double det) {
        double[][] inverse = new double[3][3];
        
        // Calculate cofactor matrix
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / det;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;
        
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / det;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / det;
        
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / det;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;
        
        return inverse;
    }
}

// Test with the example matrix from the image
class MatrixExampleTest {
    public static void main(String[] args) {
        System.out.println("=== Testing with example matrix ===");
        
        int[][] M = {
            {1, 2, 3},
            {0, 1, 4},
            {5, 6, 0}
        };
        
        System.out.println("Matrix M:");
        MatrixOperations.showMatrix(M);
        
        int[][] MT = MatrixOperations.findTranspose(M);
        System.out.println("\nTranspose M^T:");
        MatrixOperations.showMatrix(MT);
        
        double det = MatrixOperations.findDeterminant(M);
        System.out.printf("\nDeterminant: %.1f\n", det);
        
        if (det != 0) {
            double[][] inverse = MatrixOperations.findInverse(M, det);
            System.out.println("\nInverse:");
            MatrixOperations.showDoubleMatrix(inverse);
        }
    }
}