import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int scanVariable;

        while (true) {
            System.out.println("Enter Number:");
            boolean isAnInt = myScanner.hasNextInt();

            if (isAnInt) {
                    scanVariable = myScanner.nextInt();

            if (scanVariable > max) {
                max = scanVariable;
            } else if (scanVariable < min) {
            }
                } else {
                break;
            }
        }

        myScanner.close();

        System.out.println("Minimum = " + min + " and maximum = " + max);
    }
}