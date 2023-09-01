public class Point {

    private int y;
    private int x;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point (){
        this(0,0);
    }

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public double distance () {
        return (double) Math.sqrt((this.x - 0) * (x - 0) + (y - 0) * (y - 0));
    }

    public double distance (int x, int y) {
        return (double) Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance (Point newPoint) {
        return (double) Math.sqrt((this.x - newPoint.getX()) * (this.x - newPoint.getX()) + (this.y - newPoint.getY()) * (this.y - newPoint.getY()));
    }
}
