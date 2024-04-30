import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);

    // variables
    public String name = "";
    public int gamesPlayed = 0;
    public int gamesWon = 0;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    // constructor
    public Player(String name, int gamesWon, int gamesPlayed) {
        this.name = name;
        this.gamesWon = gamesWon;
        this.gamesPlayed = gamesPlayed;
    }

    // default constructor
    public Player() {
        name = "";
    }

    // displays player stats after game
    public void displayPlayerStats() {
        System.out.println("\n\n\nPlayer: " + getName() + "\nGames Won: " + getGamesWon() + "\nGames Played: "
                + getGamesPlayed() + "\n\n\n");
    }

    // gathers player name
    public void gatherPlayerInfo() {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        setName(name);
    } 
}
