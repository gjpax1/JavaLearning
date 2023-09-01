public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi engine has started";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi is braking";
    }
}
