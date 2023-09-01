public class Main {
    public static void main(String[] args) {

        System.out.println(isEvenNumber(4));
//        int count = 0;
//        while (count != 6) {
//            System.out.printf("Count value is " + count);
//            count++;
//        }
//        for (int i = 1; i < 7; i++) {
//            System.out.printf("Count value is " + i);
//        }
//
//        for (int i = 6; i!=6; i++) {
//            System.out.printf("Count value is " + count);
//        }

//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.printf("Count value is " + count);
//            count++;
////        }
//        count = 6;
//
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//
//        }   while (count !=6);
    int evenNumberSum = 0;
    int count = 0;
    int number = 4;
    int finishNumber = 20;
    while (number <= finishNumber) {
        number++;
        if (!isEvenNumber(number)) {
            continue;
        }
        evenNumberSum = evenNumberSum += number;
        count++;
        System.out.println("Even number " + number);

        if (count >= 5) {
            break;
        }

    }
        System.out.println(evenNumberSum);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 ==0) {
            return true;
        }
        return false;
    }
}