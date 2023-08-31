/*import java.util.Arrays;
import java.util.Scanner;
public class SortedArray {

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[number];
        System.out.println("Please enter your integers to be sorted");
        for (int i = 0; i < number; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray() {
        for (int i = 0; i < getIntegers(5).length; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] arrayToBeSorted) {
        int[] tempArray = arrayToBeSorted;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < tempArray.length-1; i++) {
                if (tempArray[i] < tempArray[i+1]) {
                    arrayToBeSorted[i] = tempArray[i + 1];
                    flag = true;
                }
            }
        }
        return arrayToBeSorted;
    }
}*/

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    // write code here
    public static int[] getIntegers(int number){

        Scanner sc = new Scanner(System.in);

        int[] myArray = new int[number];
        System.out.println("Enter " + number + " integers:");

        for(int i=0; i<number; i++){
            myArray[i] = sc.nextInt();
        }
        sc.close();
        return myArray;
    }
    public static void printArray(int[] myArray){

        for(int i=0; i< myArray.length; i++){
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }
    public static int[] sortIntegers(int[] myArray){

        int[] sortedArray = Arrays.copyOf(myArray, myArray.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag=false;

            for(int i=0; i< sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}