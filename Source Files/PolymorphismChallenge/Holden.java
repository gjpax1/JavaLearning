public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden engine has started";
    }

    @Override
    public String accelerate() {
        return "Holden is accelerating";
    }

    @Override
    public String brake() {
        return "Holden is braking";
    }
}
