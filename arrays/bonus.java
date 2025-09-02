import java.util.Scanner;

public class bonus{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store employee data
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        System.out.println("=== Zara Bonus Calculator ===");

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            // Salary input with validation
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary. Please re-enter employee " + (i + 1) + " details.");
                i--; // decrement index to retry
                continue;
            }

            // Years of service input with validation
            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service. Please re-enter employee " + (i + 1) + " details.");
                i--; // decrement index to retry
                continue;
            }

            // Save valid inputs
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            double bonus;

            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05; // 5% bonus
            } else {
                bonus = salaries[i] * 0.02; // 2% bonus
            }

            double newSalary = salaries[i] + bonus;

            // Store results in arrays
            bonuses[i] = bonus;
            newSalaries[i] = newSalary;

            // Update totals
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;
        }

        // Output results
        System.out.println("\n=== Salary and Bonus Report ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salaries[i] +
                    " | Bonus: " + bonuses[i] +
                    " | New Salary: " + newSalaries[i]);
        }

        System.out.println("\n=== Totals ===");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
