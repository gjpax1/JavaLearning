public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number <= 9) {
            return -1;
        }

        int sumNumber = 0;

        while (number !=0) {

            sumNumber = sumNumber + number % 10;
            number = number / 10;
        }

        return sumNumber;
    }
}