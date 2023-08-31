public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;


    public Printer(boolean isDuplex) {
        this.tonerLevel = 100;
        this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void addToner (int tonerLevel) {
        this.tonerLevel += tonerLevel;
    }

    public void printPage (int numberOfPagesPrinted) {
        System.out.println("Printing printing printing");
        this.numberOfPagesPrinted += numberOfPagesPrinted;
    }
}
