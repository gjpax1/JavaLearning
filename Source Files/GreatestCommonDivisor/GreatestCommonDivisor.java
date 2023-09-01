public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int lower = Math.min(first,second);

        for (int i = lower; i > 0; i--) {
            if ((first % i) == 0 && (second % i == 0)) {
                return i;
            }
        }
        System.out.println("Not Working");
        return -1;

    }

}
