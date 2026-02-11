import java.util.Scanner;

public class RockPaperScissorGame {

    // Method to get computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); // 0,1,2

        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    // Method to decide winner
    public static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        // Winning rules
        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate statistics and percentage
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", compPercent);

        return stats;
    }

    // Method to display game results and statistics
    public static void displayResults(String[][] gameData, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < gameData.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameData[i][0] + "\t" +
                    gameData[i][1] + "\t\t" +
                    gameData[i][2]);
        }

        System.out.println("\nOverall Statistics:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of games
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] gameData = new String[n][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter Rock/Paper/Scissors: ");
            String userChoice = sc.nextLine();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            gameData[i][0] = userChoice;
            gameData[i][1] = compChoice;
            gameData[i][2] = winner;
        }

        // Calculate statistics
        String[][] stats = calculateStats(userWins, compWins, n);

        // Display results
        displayResults(gameData, stats);

        sc.close();
    }
}
