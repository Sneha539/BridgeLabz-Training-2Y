import java.util.Scanner;

public class score {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Student Score Card Generator ===");
        System.out.println("Grading System:");
        System.out.println("A (80%+): Level 4 - Above standards");
        System.out.println("B (70-79%): Level 3 - At standards");
        System.out.println("C (60-69%): Level 2 - Approaching standards");
        System.out.println("D (50-59%): Level 1 - Below standards");
        System.out.println("E (40-49%): Level 1 - Well below standards");
        System.out.println("R (0-39%): Remedial standards");
        System.out.println("=====================================");
        
        // Get number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        // Generate random scores
        int[][] pcmScores = generateRandomScores(numStudents);
        
        // Calculate results
        double[][] studentResults = calculateResults(pcmScores);
        
        // Display scorecard
        displayScoreCard(pcmScores, studentResults);
        
        scanner.close();
    }
    
    // Method to generate random 2-digit PCM scores
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // [Physics, Chemistry, Math]
        
        System.out.println("\nGenerating random scores for " + numStudents + " students...");
        
        for (int i = 0; i < numStudents; i++) {
            // Generate random 2-digit scores between 30 and 99
            scores[i][0] = 30 + (int)(Math.random() * 70); // Physics
            scores[i][1] = 30 + (int)(Math.random() * 70); // Chemistry
            scores[i][2] = 30 + (int)(Math.random() * 70); // Math
        }
        
        return scores;
    }
    
    // Method to calculate total, average, percentage and determine grade
    public static double[][] calculateResults(int[][] pcmScores) {
        double[][] results = new double[pcmScores.length][5]; // [total, average, percentage, gradeValue, roundPercentage]
        
        for (int i = 0; i < pcmScores.length; i++) {
            int physics = pcmScores[i][0];
            int chemistry = pcmScores[i][1];
            int math = pcmScores[i][2];
            
            // Calculate total
            int total = physics + chemistry + math;
            
            // Calculate average
            double average = total / 3.0;
            
            // Calculate percentage (out of 100 for each subject, total 300)
            double percentage = (total / 300.0) * 100;
            
            // Round to 2 decimal places
            double roundedAverage = Math.round(average * 100.0) / 100.0;
            double roundedPercentage = Math.round(percentage * 100.0) / 100.0;
            
            // Determine grade value for sorting (A=6, B=5, C=4, D=3, E=2, R=1)
            double gradeValue = calculateGradeValue(roundedPercentage);
            
            results[i][0] = total;
            results[i][1] = roundedAverage;
            results[i][2] = roundedPercentage;
            results[i][3] = gradeValue;
            results[i][4] = roundedPercentage;
        }
        
        return results;
    }
    
    // Helper method to determine grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }
    
    // Helper method to get grade value for sorting
    public static double calculateGradeValue(double percentage) {
        if (percentage >= 80) return 6.0;      // A
        else if (percentage >= 70) return 5.0; // B
        else if (percentage >= 60) return 4.0; // C
        else if (percentage >= 50) return 3.0; // D
        else if (percentage >= 40) return 2.0; // E
        else return 1.0;                       // R
    }
    
    // Helper method to get grade remarks
    public static String getRemarks(String grade) {
        switch (grade) {
            case "A": return "Level 4 (Above standards)";
            case "B": return "Level 3 (At standards)";
            case "C": return "Level 2 (Approaching standards)";
            case "D": return "Level 1 (Below standards)";
            case "E": return "Level 1 (Well below standards)";
            case "R": return "Remedial standards";
            default: return "";
        }
    }
    
    // Method to display scorecard in tabular format
    public static void displayScoreCard(int[][] pcmScores, double[][] studentResults) {
        System.out.println("\n" + "=".repeat(120));
        System.out.println("                                 STUDENT SCORECARD");
        System.out.println("=".repeat(120));
        System.out.printf("%-6s\t%-10s\t%-10s\t%-10s\t%-8s\t%-10s\t%-10s\t%-8s\t%-20s%n",
                         "RollNo", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade", "Remarks");
        System.out.println("-".repeat(120));
        
        for (int i = 0; i < pcmScores.length; i++) {
            int physics = pcmScores[i][0];
            int chemistry = pcmScores[i][1];
            int math = pcmScores[i][2];
            
            double total = studentResults[i][0];
            double average = studentResults[i][1];
            double percentage = studentResults[i][2];
            
            String grade = getGrade(percentage);
            String remarks = getRemarks(grade);
            
            System.out.printf("%-6d\t%-10d\t%-10d\t%-10d\t%-8.0f\t%-10.2f\t%-10.2f\t%-8s\t%-20s%n",
                            i + 1, physics, chemistry, math, total, average, percentage, grade, remarks);
        }
        
        System.out.println("-".repeat(120));
        
        // Display class summary
        displayClassSummary(studentResults);
    }
    
    // Method to display class summary
    public static void displayClassSummary(double[][] studentResults) {
        int totalStudents = studentResults.length;
        int[] gradeCount = new int[6]; // A, B, C, D, E, R
        
        double classTotalPercentage = 0;
        double highestPercentage = 0;
        double lowestPercentage = 100;
        int topperRollNo = 1;
        
        for (int i = 0; i < studentResults.length; i++) {
            double percentage = studentResults[i][4];
            classTotalPercentage += percentage;
            
            if (percentage > highestPercentage) {
                highestPercentage = percentage;
                topperRollNo = i + 1;
            }
            
            if (percentage < lowestPercentage) {
                lowestPercentage = percentage;
            }
            
            // Count grades
            String grade = getGrade(percentage);
            switch (grade) {
                case "A": gradeCount[0]++; break;
                case "B": gradeCount[1]++; break;
                case "C": gradeCount[2]++; break;
                case "D": gradeCount[3]++; break;
                case "E": gradeCount[4]++; break;
                case "R": gradeCount[5]++; break;
            }
        }
        
        double classAveragePercentage = classTotalPercentage / totalStudents;
        
        System.out.println("\n=== CLASS SUMMARY ===");
        System.out.printf("Total Students: %d\n", totalStudents);
        System.out.printf("Class Average: %.2f%%\n", classAveragePercentage);
        System.out.printf("Highest Score: %.2f%% (Roll No: %d)\n", highestPercentage, topperRollNo);
        System.out.printf("Lowest Score: %.2f%%\n", lowestPercentage);
        System.out.println("\nGrade Distribution:");
        System.out.printf("A: %d students\n", gradeCount[0]);
        System.out.printf("B: %d students\n", gradeCount[1]);
        System.out.printf("C: %d students\n", gradeCount[2]);
        System.out.printf("D: %d students\n", gradeCount[3]);
        System.out.printf("E: %d students\n", gradeCount[4]);
        System.out.printf("R: %d students\n", gradeCount[5]);
        System.out.println("=".repeat(120));
    }
}