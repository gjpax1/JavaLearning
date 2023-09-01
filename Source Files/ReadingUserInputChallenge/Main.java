import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int sumVariable;
        int totalSum = 0;
        int countInt = 1;

        while(countInt <= 10){
            System.out.println("Please enter number " + countInt);
            sumVariable = myScanner.nextInt();

            totalSum = totalSum + sumVariable;
            myScanner.nextLine();
            countInt++;

        }
        System.out.println("Total sum = " + totalSum);
        myScanner.close();
    }
}