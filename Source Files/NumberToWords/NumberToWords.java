public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
            String wordFromNumber = "";
            while(number != 0) {

                if (number % 10 == 1) {
                    wordFromNumber = wordFromNumber + "One ";
                } else if (number % 10 == 2) {
                    wordFromNumber = wordFromNumber + "Two ";
                } else if (number % 10 == 3) {
                    wordFromNumber = wordFromNumber + "Three ";
                } else if (number % 10 == 4) {
                    wordFromNumber = wordFromNumber + "Four ";
                } else if (number % 10 == 5) {
                    wordFromNumber = wordFromNumber + "Five ";
                } else if (number % 10 == 6) {
                    wordFromNumber = wordFromNumber + "Six ";
                } else if (number % 10 == 7) {
                    wordFromNumber = wordFromNumber + "Seven ";
                } else if (number % 10 == 8) {
                    wordFromNumber = wordFromNumber + "Eight ";
                } else if (number % 10 == 9) {
                    wordFromNumber = wordFromNumber + "Nine ";
                }
                number = number / 10;
            }
        System.out.println(wordFromNumber);
        }

        public static int reverse (int number) {
            int reversedNumber = 0;

            while (number != 0) {
                reversedNumber = (reversedNumber * 10) + (number % 10);
                System.out.println(reversedNumber);
                number = (number / 10);
            }
            return reversedNumber;
        }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }



}