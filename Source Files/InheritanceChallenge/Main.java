public class Main {
    public static void main(String[] args) {
        Altima shittyCar = new Altima(true);
        shittyCar.move(5);
        shittyCar.turn(10);
        System.out.println(shittyCar.getSpeed());
        System.out.println(shittyCar.getTurnDegrees());
        System.out.println(shittyCar.getColor());
        System.out.println(shittyCar.getIsBumperDamaged());
        Altima.blowUp();
    }
}