public class Altima extends Car {
    private String color;
    private boolean isBumperDamaged;
    private int frontWheelDrive;

    public Altima (String color, boolean isBumperDamaged, int frontWheelDrive) {
        this.color = color;
        this.isBumperDamaged = isBumperDamaged;
        this.frontWheelDrive = frontWheelDrive;
    }

    public Altima (boolean isBumperDamaged) {
        this("White", isBumperDamaged, 2);
    }

    public static void blowUp () {
        System.out.println("Your car just blew up!");
    }

    @Override
    public void move (int speed) {
        super.move(speed);
        System.out.println("Your car is slow");
    }

    @Override
    public void turn (int turnDegrees) {
        super.turn(turnDegrees);
        System.out.println("For some reason your car is turning in the opposite direction!");    }


    public String getColor () {
        return this.color;
    }

    public boolean getIsBumperDamaged () {
        return this.isBumperDamaged;
    }
}
