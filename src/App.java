import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGames;
        boolean unlimitedGames = false;
        Player player = new Player();
        player.gatherPlayerInfo();

        // determines how many games will be played
        System.out.println("How many games would you like to play?\nEnter 0 for unlimited games.");
        try {
            numberOfGames = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Please enter a valid number!!!!");
            scanner.nextLine();
            numberOfGames = scanner.nextInt();
        }
        if (numberOfGames == 0) {
            unlimitedGames = true;
        }
        if (unlimitedGames)
            while (true) {
                Words wordGame = new Words();
                wordGame.start(player);
                player.gamesPlayed++;
                player.displayPlayerStats();
            }
        else {
            for (int i = 1; i <= numberOfGames; i++) {
                Words wordGame = new Words();
                wordGame.start(player);
                player.gamesPlayed++;
                player.displayPlayerStats();
            }
        }
        scanner.close(); 
    }

}
