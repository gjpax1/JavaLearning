public class Main {
    public static void main(String[] args) {
    int newScore = calculateScore("Greg", 10);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(0,1));

        //36+3 = 39 * 12 * 2.54
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player scored zero");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }
        return (feet * 12d * 2.54d) + (inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        return (inches / 12);
    }





}
