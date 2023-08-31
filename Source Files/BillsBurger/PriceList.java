import java.util.Scanner;

public class PriceList {

    private final double lettucePrice;
    private final double tomatoPrice;
    private final double mushroomPrice;
    private final double onionsPrice;
    private final double mustardPrice;
    private final double ketchupPrice;
    private final double baseBurgerPrice;
    private double finalBurgerPrice;

    public PriceList(double lettucePrice, double tomatoPrice, double mushroomPrice, double onionsPrice, double mustardPrice, double ketchupPrice, double baseBurgerPrice) {
        this.lettucePrice = lettucePrice;
        this.tomatoPrice = tomatoPrice;
        this.mushroomPrice = mushroomPrice;
        this.onionsPrice = onionsPrice;
        this.mustardPrice = mustardPrice;
        this.ketchupPrice = ketchupPrice;
        this.baseBurgerPrice = baseBurgerPrice;
        this.finalBurgerPrice = baseBurgerPrice;
    }

    public void addIngredient () {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        scanner.close();
            if (userInput == 1) {
                addLettuce();
            } else if (userInput == 2) {
                addTomato();
            } else if (userInput == 3) {
                addMushroom();
            } else if (userInput == 4) {
                addOnions();
            } else if (userInput == 5) {
                addKetchup();
            } else if (userInput == 6) {
                addMustard();
            } else {
                System.out.println("Invalid Entry");
        }
    }

    private void addLettuce() {
            System.out.println("Lettuce Added");
            this.finalBurgerPrice += this.lettucePrice;
    }
    private void addTomato() {
            System.out.println("Tomato Added");
            this.finalBurgerPrice += this.tomatoPrice;
    }
    private void addMushroom() {
            System.out.println("Mushroom Added");
            this.finalBurgerPrice += this.mushroomPrice;
    }
    private void addOnions () {
            System.out.println("Onions Added");
            this.finalBurgerPrice += this.onionsPrice;
    }
    private void addKetchup() {
            System.out.println("Ketchup Added");
            this.finalBurgerPrice += this.ketchupPrice;

    }
    private void addMustard() {
            System.out.println("Mustard Added");
            this.finalBurgerPrice += this.mustardPrice;
    }

    public void displayTotal () {
        System.out.println("Your total is = " + finalBurgerPrice);
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getMushroomPrice() {
        return mushroomPrice;
    }

    public double getOnionsPrice() {
        return onionsPrice;
    }

    public double getMustardPrice() {
        return mustardPrice;
    }

    public double getKetchupPrice() {
        return ketchupPrice;
    }

    public double getBaseBurgerPrice() {
        return baseBurgerPrice;
    }

    public double getFinalBurgerPrice() {
        return finalBurgerPrice;
    }
}
