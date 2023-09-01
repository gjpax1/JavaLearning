public class SumOddRange {

    public static boolean isOdd (int number) {
        if ((number % 2 == 0) || (number < 0)) {
            return false;
        }
        return true;
    }

    public static int sumOdd (int start, int end) {
        if ((start < 0) || (end < 0) || (end < start)) {
            return -1;
        }
        if (!isOdd(start)) {
            start = start + 1;
        }

            int sumNumber = 0;

            for (int i = start; i <= end; i += 2) {

                    sumNumber = sumNumber + i;

                }

            return sumNumber;
        }

    }

