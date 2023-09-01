public class LastDigitChecker {

    public static boolean hasSameLastDigit (int first, int second, int third) {

        if (!isValid(first) || (!isValid(second) || (!isValid(third)))) {
            return false;
        }

        int firstRight = first % 10;
        int secondRight = second % 10;
        int thirdRight = third % 10;


        if ((firstRight == secondRight) || (firstRight == thirdRight) || (secondRight == thirdRight)) {
            return true;
        }

        return false;
    }

    public static boolean isValid (int number) {
        if (((number < 10) || (number > 1000))) {
            return false;
        } return true;
    }
}
