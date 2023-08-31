import java.text.Format;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if ((int) (firstNumber * 1000) == (int)(secondNumber * 1000)) {
            return true;
        } return false;

    }
    public static void test(double firstNumber, double secondNumber) {
        System.out.format("%.3f", firstNumber);
        System.out.println(firstNumber);
        //System.out.println(Math.round(secondNumber*1000/1000));


    }

}
