import java.util.Map;
import java.util.TreeMap;

public class Leaderboard {
    TreeMap<Integer, String> scores = new TreeMap<>();

    // Add a player 
    public void addScore(String player, int score) {
        scores.put(score, player);
    }

    // get top 3 players
    public void getTopPlayers() {
        scores.descendingMap().entrySet().stream()
                .limit(3)
                .forEach(entry -> System.out.println(entry.getValue() + " -> " + entry.getKey()));
    }

    public void displayLeaderboard() {
        System.out.println("Leaderboard :");
        scores.descendingMap().
            forEach((score, player) -> System.out.println(player + " -> " + score));
    }

    public static void main(String[] args) {
        Leaderboard leaderboard = new Leaderboard();

        // Adding player scores
        leaderboard.addScore("shyam", 1500);
        leaderboard.addScore("rohit", 1800);
        leaderboard.addScore("xyz", 1200);
        leaderboard.addScore("abc", 1600);
        leaderboard.addScore("hello", 1750);

        // Display full leaderboard
        leaderboard.displayLeaderboard();

        // Get top 3 players
        System.out.println("Top 3 Players:");
        leaderboard.getTopPlayers();
    }
}
