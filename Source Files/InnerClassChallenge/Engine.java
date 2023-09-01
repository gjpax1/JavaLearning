public class Engine {

    private int cylinders;
    private boolean isOn;
    private Gear currentGear;

    public Engine(int cylinders) {
        this.cylinders = cylinders;
        this.isOn = false;
    }



    public class Gear {
        private int currentGear;
        private boolean isManual;
        private int maxGear;
        private int minGear;

        private Gear(boolean isManual, int maxGear) {
            this.isManual = isManual;
            this.maxGear = maxGear;
            this.minGear = 0;
        }

        public void setCurrentGear (int currentGear) {
            this.currentGear = currentGear;
            System.out.println("Current gear is now " + this.currentGear);
        }
    }
}
