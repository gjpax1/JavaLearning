public class Main {
    public static void main(String[] args) {

        Sink mySink = new Sink("Nickel", false);
        Toilet myToilet = new Toilet(1, true);
        Bathtub myBathtub = new Bathtub("Colbalt", true);

        Bathroom myBathroom = new Bathroom(myBathtub, mySink, myToilet);

        System.out.println(myBathroom.getTheToilet().isDirty());
        myBathroom.flushToilet();


    }
}