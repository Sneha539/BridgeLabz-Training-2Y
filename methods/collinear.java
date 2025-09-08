import java.util.Scanner;

public class collinear {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Collinear Points Checker ===");
        
        // Get input for three points
        System.out.println("Enter coordinates for Point A:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.println("Enter coordinates for Point B:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        
        System.out.println("Enter coordinates for Point C:");
        System.out.print("x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("y3: ");
        double y3 = scanner.nextDouble();
        
        // Check using slope method
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        
        // Check using area method
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        
        // Display results
        System.out.println("\n=== Results ===");
        System.out.println("Points: A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), C(" + x3 + ", " + y3 + ")");
        System.out.println("Collinear by slope method: " + collinearBySlope);
        System.out.println("Collinear by area method: " + collinearByArea);
        
        if (collinearBySlope && collinearByArea) {
            System.out.println("All three points are collinear!");
        } else {
            System.out.println("The points are NOT collinear.");
        }
        
        // Test with the sample points
        System.out.println("\n=== Sample Test ===");
        testSamplePoints();
        
        scanner.close();
    }
    
    // Method to check collinearity using slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes between different point pairs
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);
        
        // Check if all slopes are equal (considering floating point precision)
        return Math.abs(slopeAB - slopeBC) < 1e-10 && Math.abs(slopeAB - slopeAC) < 1e-10;
    }
    
    // Helper method to calculate slope between two points
    private static double calculateSlope(double x1, double y1, double x2, double y2) {
        // Handle vertical line case (infinite slope)
        if (Math.abs(x2 - x1) < 1e-10) {
            return Double.POSITIVE_INFINITY;
        }
        return (y2 - y1) / (x2 - x1);
    }
    
    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate area using the determinant formula
        double area = 0.5 * Math.abs(
            x1 * (y2 - y3) + 
            x2 * (y3 - y1) + 
            x3 * (y1 - y2)
        );
        
        // Points are collinear if area is approximately zero
        return area < 1e-10;
    }
    
    // Test method for the sample points A(2,4), B(4,6), C(6,8)
    public static void testSamplePoints() {
        double x1 = 2, y1 = 4;
        double x2 = 4, y2 = 6;
        double x3 = 6, y3 = 8;
        
        System.out.println("Testing sample points: A(2,4), B(4,6), C(6,8)");
        
        boolean slopeResult = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        
        System.out.println("Slope method result: " + slopeResult);
        System.out.println("Area method result: " + areaResult);
        
        if (slopeResult && areaResult) {
            System.out.println("✓ Sample points are collinear as expected!");
        } else {
            System.out.println("✗ Unexpected result for sample points!");
        }
        
        // Show area calculation details
        double area = 0.5 * Math.abs(
            x1 * (y2 - y3) + 
            x2 * (y3 - y1) + 
            x3 * (y1 - y2)
        );
        System.out.println("Area calculation: " + area);
    }
}