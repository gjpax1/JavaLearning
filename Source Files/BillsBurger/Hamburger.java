    public class Hamburger {
    private final String name;
    private final String meat;
    private final double price;
    private final String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println(name + " has been added for $" + price);
    }

        public void addHamburgerAddition2(String name, double price) {
            this.addition2Name = name;
            this.addition2Price = price;
            System.out.println(name + " has been added for $" + price);
        }

        public void addHamburgerAddition3(String name, double price) {

            this.addition3Name = name;
            this.addition3Price = price;
            System.out.println(name + " has been added for $" + price);
        }

        public void addHamburgerAddition4(String name, double price) {
            this.addition4Name = name;
            this.addition4Price = price;
            System.out.println(name + " has been added for $" + price);
        }

        public double itemizeHamburger() {
            return this.price + addition1Price + addition2Price + addition3Price + addition4Price;
        }


}
