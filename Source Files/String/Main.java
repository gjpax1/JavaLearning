public class Main {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";

        System.out.println("MySting is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("MySting is equal to " + myString);
        myString = myString + "\u00A9 2019";


        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);




    }
}