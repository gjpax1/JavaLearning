public class Bathroom {

    private Sink theSink;
    private Toilet theToilet;
    private Bathtub theBathTub;

    public Bathroom (Bathtub theBathTub, Sink theSink, Toilet theToilet) {
        this.theBathTub = theBathTub;
        this.theSink = theSink;
        this.theToilet = theToilet;
    }

    public Sink getTheSink() {
        return theSink;
    }

    public Toilet getTheToilet() {
        return theToilet;
    }

    public Bathtub getTheBathTub() {
        return theBathTub;
    }

    public void flushToilet () {
        System.out.println("Bathroom Class - Flushing Toilet");
        theToilet.flush();
    }
}
