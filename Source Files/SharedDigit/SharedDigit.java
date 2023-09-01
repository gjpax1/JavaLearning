public class SharedDigit {

    public static boolean hasSharedDigit (int numberOne, int numberTwo) {
        if ((numberOne < 10) || (numberOne > 99) || (numberTwo < 10) || (numberTwo > 99)) {
            return false;
        }

        if (numberOne % 10 == numberTwo % 10 || numberOne / 10 == numberTwo / 10 || numberOne % 10 == numberTwo / 10) {
            return true;

        }
        return false;

    }

}
