public class Printer1 {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer1(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 || tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else this.tonerLevel = -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {
        if ((tonerAmount < 0 || tonerAmount > 100) || (this.tonerLevel + tonerAmount) > 100) {
            return -1;
        } else {
            return this.tonerLevel += tonerAmount;
        }
    }

    public int printPages (int pagesToPrint) {
        if (this.duplex) {
            this.pagesPrinted = this.pagesPrinted + (pagesToPrint / 2);
            return (this.pagesPrinted / 2) + ((pagesToPrint / 2));

        } else {
            this.pagesPrinted = this.pagesPrinted + pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted () {
        return this.pagesPrinted;
    }

}
