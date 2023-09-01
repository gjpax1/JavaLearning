public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int perfectNumberSum = 0;

        for (int i = (number-1); i > 0; i--) {
            if (number % i == 0) {
                perfectNumberSum = perfectNumberSum += i;
            }
        }

        if (number == perfectNumberSum) {
            return true;
        }
        System.out.println(perfectNumberSum);
        return false;
    }
}
