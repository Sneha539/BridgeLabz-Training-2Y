public class spring {

    // Method to check if the date is in spring season
    public static boolean isSpring(int month, int day) {
        // Spring season: March 20 to June 20
        if (month == 3 && day >= 20 && day <= 31) {
            return true; // March 20-31
        } else if (month == 4 || month == 5) {
            return true; // April and May
        } else if (month == 6 && day >= 1 && day <= 20) {
            return true; // June 1-20
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check for valid month and day
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid month or day.");
            return;
        }

        // Determine if it's spring
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
