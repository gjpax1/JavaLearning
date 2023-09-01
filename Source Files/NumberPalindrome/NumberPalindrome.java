public class NumberPalindrome {


    public static boolean isPalindrome (int number) {
        int lastDigit = 0;
        int reverse = 0;
        int numberADJ = number;

        while (numberADJ != 0) {
            lastDigit = numberADJ % 10;
            numberADJ = (numberADJ / 10);
            reverse = ((reverse * 10) + lastDigit);
        }
        if (number == reverse) {
            return true;
        }
        System.out.println("Reverse # = " + reverse);
        System.out.println("Number # = " + number);
        return false;
    }

}
