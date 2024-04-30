public class HangMan {
    public int strikes;

    // credits to https://github.com/YungNewton for the HangMan Art
    String[] HANGMANPICS = { """
             +--+
             |  |
                |
                |
                |
                |
            =====""", """
             +--+
             |  |
             O  |
                |
                |
                |
            =====""", """
             +--+
             |  |
             O  |
             |  |
                |
                |
            =====""", """
             +--+
             |  |
             O  |
            /|  |
                |
                |
            =====""", """
             +--+
             |  |
             O  |
            /|\\ |
                |
                |
            =====""", """
             +--+
             |  |
             O  |
            /|\\ |
            /   |
                |
            =====""", """
             +--+
             |  |
             O  |
            /|\\ |
            / \\ |
                |
            =====""" };

    // constructor
    public HangMan(int strikes) {
        this.strikes = strikes;
    }

    // getter
    public int getStrikes() {
        return strikes;
    }

    public void display() {
        System.out.println("\n" + HANGMANPICS[getStrikes()]);
    }
}
