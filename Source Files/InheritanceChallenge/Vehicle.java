public class Vehicle {

    private int speed;

    public void move (int speed) {
        setSpeed(speed);
        System.out.println("You are now moving at " + getSpeed() + " MPH");
    }

    public int getSpeed () {
        return this.speed;
    }

    public void setSpeed (int speed) {
        this.speed = speed;
    }


}
