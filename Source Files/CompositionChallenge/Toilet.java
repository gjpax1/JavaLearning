public class Toilet {
    private int flushLever;
    private boolean isDirty;

    public Toilet(int flushLever, boolean isDirty) {
        this.flushLever = flushLever;
        this.isDirty = isDirty;
    }

    public int getFlushLever() {
        return flushLever;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void flush () {
        System.out.println("Toilet is flushing");
    }
}
