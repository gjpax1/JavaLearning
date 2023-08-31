public class Sink {

    private String drain;
    private boolean isHot;

    public Sink(String drain, boolean isHot) {
        this.drain = drain;
        this.isHot = isHot;
    }

    public String getDrain() {
        return drain;
    }

    public boolean isHot() {
        return isHot;
    }
}
