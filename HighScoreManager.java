import java.util.ArrayList;
import java.util.Collections;

public class HighScoreManager {
    private ArrayList<Integer> highScores;

    public HighScoreManager() {
        highScores = new ArrayList<>();
    }
    public String getHighScores() {
        // Create a string builder to accumulate the high scores
        StringBuilder scoresBuilder = new StringBuilder();
        for (int score : highScores) {
            scoresBuilder.append(score).append("\n");
        }
        return scoresBuilder.toString();
    }


    public void addScore(int score) {
        highScores.add(score);
        Collections.sort(highScores, Collections.reverseOrder());
    }

    public void displayScores() {
        System.out.println("High Scores:");
        for (int score : highScores) {
            System.out.println(score);
        }
    }
}