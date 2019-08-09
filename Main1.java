package Udemy;

public class Main1 {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim ", 500);
        System.out.println("\nNew score is " + newScore);
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("\nUdemy.Player " + playerName + "scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("\nUnnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("\nNo player name, no player score");
        return 0;
    }
}