public class Car extends Vehicle {
    private int turnDegrees;

    public void turn (int turnDegrees) {
        setTurnDegrees(turnDegrees);
        System.out.println("turning turning turning " + turnDegrees + " degrees");
    }

    public void setTurnDegrees (int turnDegrees) {
        this.turnDegrees = turnDegrees;
    }

    public int getTurnDegrees () {
        return this.turnDegrees;
    }
}
