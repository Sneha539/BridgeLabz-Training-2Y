import java.text.NumberFormat;
import java.util.Locale;

public class zara {
    
    public static void main(String[] args) {
        System.out.println("=== Zara Company Employee Bonus Calculator ===");
        System.out.println("Celebrating 10 Years of Excellence!\n");
        
        // Generate employee data
        double[][] employeeData = generateEmployeeData();
        
        // Calculate bonuses and new salaries
        double[][] bonusResults = calculateBonusAndNewSalary(employeeData);
        
        // Display results in tabular format
        displayResults(employeeData, bonusResults);
        
        // Calculate and display totals
        calculateAndDisplayTotals(employeeData, bonusResults);
    }
    
    // Method to generate random employee data
    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2]; // [salary, yearsOfService]
        
        System.out.println("Generating employee data...");
        
        for (int i = 0; i < 10; i++) {
            // Generate 5-digit salary between 30000 and 90000
            double salary = 30000 + Math.random() * 60000;
            salary = Math.round(salary); // Round to nearest whole number
            
            // Generate years of service between 1 and 15 years
            double yearsOfService = 1 + Math.random() * 14;
            yearsOfService = Math.round(yearsOfService); // Round to nearest whole number
            
            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }
        
        return data;
    }
    
    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] results = new double[10][3]; // [oldSalary, bonusAmount, newSalary]
        
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage;
            
            // Determine bonus percentage based on years of service
            if (yearsOfService > 5) {
                bonusPercentage = 0.05; // 5% bonus
            } else {
                bonusPercentage = 0.02; // 2% bonus
            }
            
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;
            
            results[i][0] = oldSalary;
            results[i][1] = bonusAmount;
            results[i][2] = newSalary;
        }
        
        return results;
    }
    
    // Method to display results in tabular format
    public static void displayResults(double[][] employeeData, double[][] bonusResults) {
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat yearsFormat = NumberFormat.getInstance();
        yearsFormat.setMaximumFractionDigits(0);
        
        System.out.println("==================================================================================");
        System.out.println("                             EMPLOYEE BONUS REPORT");
        System.out.println("==================================================================================");
        System.out.printf("%-4s %-12s %-8s %-15s %-15s %-15s%n", 
                         "Emp#", "Years", "Bonus%", "Old Salary", "Bonus Amount", "New Salary");
        System.out.println("----------------------------------------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            double yearsOfService = employeeData[i][1];
            double oldSalary = bonusResults[i][0];
            double bonusAmount = bonusResults[i][1];
            double newSalary = bonusResults[i][2];
            
            String bonusPercent = (yearsOfService > 5) ? "5%" : "2%";
            
            System.out.printf("%-4d %-12s %-8s %-15s %-15s %-15s%n",
                            i + 1,
                            yearsFormat.format(yearsOfService) + " yrs",
                            bonusPercent,
                            currency.format(oldSalary),
                            currency.format(bonusAmount),
                            currency.format(newSalary));
        }
        
        System.out.println("----------------------------------------------------------------------------------");
    }
    
    // Method to calculate and display totals
    public static void calculateAndDisplayTotals(double[][] employeeData, double[][] bonusResults) {
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        
        double totalOldSalary = 0;
        double totalBonusAmount = 0;
        double totalNewSalary = 0;
        
        for (int i = 0; i < 10; i++) {
            totalOldSalary += bonusResults[i][0];
            totalBonusAmount += bonusResults[i][1];
            totalNewSalary += bonusResults[i][2];
        }
        
        System.out.printf("%-4s %-12s %-8s %-15s %-15s %-15s%n",
                        "TOT", "", "",
                        currency.format(totalOldSalary),
                        currency.format(totalBonusAmount),
                        currency.format(totalNewSalary));
        
        System.out.println("==================================================================================");
        
        // Display summary
        System.out.println("\n=== SUMMARY ===");
        System.out.println("Total Old Salary: " + currency.format(totalOldSalary));
        System.out.println("Total Bonus Amount: " + currency.format(totalBonusAmount));
        System.out.println("Total New Salary: " + currency.format(totalNewSalary));
        
        // Count employees with more than 5 years service
        int experiencedEmployees = 0;
        for (int i = 0; i < 10; i++) {
            if (employeeData[i][1] > 5) {
                experiencedEmployees++;
            }
        }
        
        System.out.println("Employees with >5 years service: " + experiencedEmployees + "/10");
        System.out.println("Employees with ≤5 years service: " + (10 - experiencedEmployees) + "/10");
        
        System.out.println("\nThank you for 10 years of dedicated service!");
    }
}