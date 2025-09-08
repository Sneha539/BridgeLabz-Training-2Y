import java.util.Random;
import java.util.Scanner;

public class matrix {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== Matrix Operations Program ===");
        System.out.println("Operations: Addition, Subtraction, Multiplication");
        System.out.println("==================================");
        
        // Get matrix dimensions from user
        System.out.print("Enter rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter columns for Matrix A: ");
        int colsA = scanner.nextInt();
        
        System.out.print("Enter rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter columns for Matrix B: ");
        int colsB = scanner.nextInt();
        
        // Create random matrices
        int[][] matrixA = createRandomMatrix(rowsA, colsA, random);
        int[][] matrixB = createRandomMatrix(rowsB, colsB, random);
        
        // Display matrices
        System.out.println("\nMatrix A:");
        showMatrix(matrixA);
        
        System.out.println("Matrix B:");
        showMatrix(matrixB);
        
        // Perform operations
        System.out.println("\n=== Matrix Operations Results ===");
        
        // Addition
        if (rowsA == rowsB && colsA == colsB) {
            int[][] addResult = addMatrices(matrixA, matrixB);
            System.out.println("Matrix A + B:");
            showMatrix(addResult);
        } else {
            System.out.println("Cannot add matrices - different dimensions");
        }
        
        // Subtraction
        if (rowsA == rowsB && colsA == colsB) {
            int[][] subResult = subtractMatrices(matrixA, matrixB);
            System.out.println("Matrix A - B:");
            showMatrix(subResult);
        } else {
            System.out.println("Cannot subtract matrices - different dimensions");
        }
        
        // Multiplication
        if (colsA == rowsB) {
            int[][] multResult = multiplyMatrices(matrixA, matrixB);
            System.out.println("Matrix A × B:");
            showMatrix(multResult);
        } else {
            System.out.println("Cannot multiply matrices - columns of A must equal rows of B");
        }
        
        // Also try B × A if possible
        if (colsB == rowsA) {
            int[][] multResultBA = multiplyMatrices(matrixB, matrixA);
            System.out.println("Matrix B × A:");
            showMatrix(multResultBA);
        } else {
            System.out.println("Cannot multiply B × A - columns of B must equal rows of A");
        }
        
        scanner.close();
    }
    
    // Create a random matrix with given dimensions
    public static int[][] createRandomMatrix(int rows, int cols, Random rand) {
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers 0-9
            }
        }
        
        return matrix;
    }
    
    // Display a matrix
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
    
    // Add two matrices
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            throw new IllegalArgumentException("Matrices must have same dimensions for addition");
        }
        
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        return result;
    }
    
    // Subtract two matrices
    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            throw new IllegalArgumentException("Matrices must have same dimensions for subtraction");
        }
        
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        
        return result;
    }
    
    // Multiply two matrices
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int cols1 = mat1[0].length;
        int rows2 = mat2.length;
        
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Columns of first matrix must equal rows of second matrix");
        }
        
        int rowsResult = mat1.length;
        int colsResult = mat2[0].length;
        int[][] result = new int[rowsResult][colsResult];
        
        for (int i = 0; i < rowsResult; i++) {
            for (int j = 0; j < colsResult; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += mat1[i][k] * mat2[k][j];
                }
                result[i][j] = sum;
            }
        }
        
        return result;
    }
    
    // Additional method to show matrix multiplication step by step (for learning)
    public static void showMultiplicationSteps(int[][] mat1, int[][] mat2) {
        System.out.println("\nMultiplication steps for one element:");
        System.out.println("Let's calculate element [0][0] of the result:");
        
        int sum = 0;
        for (int k = 0; k < mat1[0].length; k++) {
            System.out.printf("(%d × %d) + ", mat1[0][k], mat2[k][0]);
            sum += mat1[0][k] * mat2[k][0];
        }
        System.out.println("= " + sum);
    }
}

// Simple test class to demonstrate with the example from the image
class MatrixTest {
    public static void main(String[] args) {
        System.out.println("=== Testing with example matrices ===");
        
        // Create matrices from the example
        int[][] A = {
            {1, 2, 3},    // a=1, b=2, c=3
            {4, 5, 6}     // x=4, y=5, z=6
        };
        
        int[][] B = {
            {7, 10},      // α=7, ρ=10
            {8, 11},      // β=8, σ=11
            {9, 12}       // γ=9, τ=12
        };
        
        System.out.println("Matrix A (2x3):");
        matrix.showMatrix(A);
        
        System.out.println("Matrix B (3x2):");
        matrix.showMatrix(B);
        
        // Multiply A × B
        int[][] AB = matrix.multiplyMatrices(A, B);
        System.out.println("A × B (should be 2x2):");
        matrix.showMatrix(AB);
        
        // Multiply B × A
        int[][] BA = matrix.multiplyMatrices(B, A);
        System.out.println("B × A (should be 3x3):");
        matrix.showMatrix(BA);
        
        // Verify results match the example
        System.out.println("Expected A×B[0][0]: " + (1*7 + 2*8 + 3*9) + " (got: " + AB[0][0] + ")");
        System.out.println("Expected A×B[0][1]: " + (1*10 + 2*11 + 3*12) + " (got: " + AB[0][1] + ")");
    }
}