import java.util.Scanner;

public class Menu {

    private Hamburger hamburger;
    private HealthyBurger healthyBurger;
    private DeluxeBurger deluxeBurger;
    private final PriceList priceList;

    public Menu(PriceList priceList) {
        this.priceList = priceList;
    }

//    public void orderBurger () {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please select the following to begin your your /n"
//        "Select 1 to order a Hamburger /n" +
//                "Select 2 to order a Deluxe Burger /n" +
//                "Select 3 to order a Healthy Burger");
//        int inputInt = scanner.nextInt();
//        while (true) {
//            if (inputInt == 1) {
//                new Hamburger()
//            }
//        }
//    }
}
