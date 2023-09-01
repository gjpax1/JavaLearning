public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(6);
        engine.new Gear(false,6);

        Engine.Gear first = engine.new Gear(false,6);

        first.setCurrentGear(5);
    }
}