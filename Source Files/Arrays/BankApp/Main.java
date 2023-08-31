public class Main {
    public static void main(String[] args) {
    BranchLocation NorthLocation = new BranchLocation("North Location");
    NorthLocation.addCustomer("Greg", "123-456-7897", 100000.00);
    NorthLocation.displayCustomers();



    BranchLocation SouthLocation = new BranchLocation("South Location");
    SouthLocation.addCustomer("Emmit", "123-456-7897", 1000000.00);
    SouthLocation.displayCustomers();

    }
}