import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        printArray(myArray);
        reverseArray(myArray);
        printArray(myArray);
        System.out.println(myArray.length);



    }

    public static void reverseArray(int[] myArray) {
        int[] tempArray = Arrays.copyOf(myArray,myArray.length);
        int temp = myArray.length - 1;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = tempArray[temp];
            temp--;
        }
    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " = " + myArray[i]);
        }
    }

}