import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how long you would like your array to be");
        int count = scanner.nextInt();

        int[] myArray = readIntegers(count);
        printArray(myArray);
        System.out.println("The minimum number in myArray is " + findMin(myArray));

    }

    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[count];
        System.out.println("Please enter " + count + " numbers");
        for (int i = 0; i < count; i++) {
            myArray[i] = scanner.nextInt();
        }
        scanner.close();
        return myArray;
    }

    public static int findMin (int[] myArray) {
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < myArray.length-1; i++) {
                if (myArray[i] > myArray[i+1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return myArray[0];
    }

    public static void printArray (int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Array element " + i + " = " + myArray[i]);
        }
    }


}