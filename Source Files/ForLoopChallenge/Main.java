public class Main {
    public static void main(String[] args) {

        int number = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i+=1 ) {
            if ((i % 3 == 0) && (i % 5 ==0)) {
                number = number + i;
                System.out.println("Number equals " + number);
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Total sum of all 5 numbers equals " + number);
    }
}