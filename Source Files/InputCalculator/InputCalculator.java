import java.util.Scanner;
public class InputCalculator {
        public static void inputThenPrintSumAndAverage () {
            Scanner scanner = new Scanner(System.in);
            int sumValue = 0;
            int count = 0;
            //boolean isAnInt = scanner.hasNextInt();

            while (scanner.hasNextInt()) {
                sumValue += scanner.nextInt();
                count++;
            }

            System.out.println("SUM = " + sumValue + " AVG = " + Math.round((double)sumValue / count));

            scanner.close();
            }
    }


//import java.util.Scanner;
//
//public class InputCalculator {
//    public static void inputThenPrintSumAndAverage(){
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//
//        while(scanner.hasNextInt()){
//            sum += scanner.nextInt();
//            count++;
//            // scanner.nextLine(); // not really needed because we don't need to print an alert for invalid number
//            // however, inputting multiple numbers separated by space will add all numbers
//        }
//        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
//        scanner.close();
//    }
//}

