public class Main {


    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        displayHighScorePosition("Greg", calculateHighScorePosition(1000));
        displayHighScorePosition("Good Enough", calculateHighScorePosition(900));
        displayHighScorePosition("Bad", calculateHighScorePosition(400));
        displayHighScorePosition("Loser", calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition(String playerName, int positionOnScoreBoard) {
        System.out.println(" managed to get into position " + positionOnScoreBoard + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } return 4;

        int position = 4; // assuming position 4 will be returned
        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100); {
            position = 3;
        }

        return position;


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=2000;
            return finalScore;
        } else {
            return -1;
        }

    }

}
