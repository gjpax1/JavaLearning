import java.util.Scanner;

public class arraySorter {

    private static Scanner scanner = new Scanner(System.in);
    int[] arrayToSort;

        public int[] getIntegers (int numbers) {
            System.out.println("Enter " + numbers + " integer values.\r");
            int[] values = new int[numbers];

            for (int i = 0; i<values.length; i++) {
                values[i] = scanner.nextInt();
            }
            return values;
        }

        public int[] sortArray(int[] arrayToSort) {
            int[] sortedArray = arrayToSort;
            int count = 0;
            for (int i=0; i < getArrayToSort().length;i++) {
                if (sortedArray[i] > (sortedArray[i+1])) {
                    continue;
                    // 5 4 2 11 5
                } else {
                    sortedArray[i] = arrayToSort [i+1];
                    sortedArray[i+1] = arrayToSort [i];

                }
            }

        }

    public void setArrayToSort() {
        this.arrayToSort = getIntegers(5);
    }

    public int[] getArrayToSort() {
        return arrayToSort;
    }
}
