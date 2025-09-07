import java.util.Scanner;

public class rockpaper {

    // Method to get computer choice using Math.random
    public static String getComputerChoice() {
        int num = (int) (Math.random() * 3); // 0,1,2
        if (num == 0) return "rock";
        else if (num == 1) return "paper";
        else return "scissors";
    }

    // Method to decide winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "draw";
        }
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "user";
        }
        return "computer";
    }

    // Method to calculate averages and percentages
    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];

        double userPercent = (games > 0) ? (userWins * 100.0 / games) : 0;
        double compPercent = (games > 0) ? (compWins * 100.0 / games) : 0;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] rounds, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Round\tUser\tComputer\tWinner");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < rounds.length; i++) {
            System.out.println((i + 1) + "\t" + rounds[i][0] + "\t" + rounds[i][1] + "\t\t" + rounds[i][2]);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("--------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] rounds = new String[games][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;

            rounds[i][0] = userChoice;
            rounds[i][1] = compChoice;
            rounds[i][2] = winner;
        }

        // Calculate final stats
        String[][] stats = calculateStats(userWins, compWins, games);

        // Display all results
        displayResults(rounds, stats);

        sc.close();
    }
}
