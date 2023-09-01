
public class Car {
    private int cylinders;
    private int wheels;
    private boolean engine;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        this.name = name;

    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public void startEngine () {
        if (!isEngine()) {
            this.engine = true;
            System.out.println("Engine has started");
        } else {
            System.out.println("Engine is already on");
        }
        }

    public void accelerate () {
        System.out.println("Going faster!");
    }

    public void brake () {
        System.out.println("Stopping!");
    }

}
