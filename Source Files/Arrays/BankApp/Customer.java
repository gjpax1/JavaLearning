import java.util.ArrayList;

public class Customer {

    private String name;
    private String phoneNumber;
    private double bankBalance;
    private ArrayList<Double> bankTransactions = new ArrayList<Double>();

    public Customer(String name, String phoneNumber, double bankBalance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bankBalance = bankBalance;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public ArrayList<Double> getBankTransactions() {
        return bankTransactions;
    }

    public static Customer newCustomer (String name, String phoneNumber, double bankBalance) {
        return new Customer(name, phoneNumber, bankBalance);
    }

    public void withdrawalAmount (double withdrawalAmount) {
        this.bankBalance -= withdrawalAmount;
        addTransaction(withdrawalAmount);
    }

    public void depositAmount (double depositAmount) {
        this.bankBalance -= depositAmount;
        addTransaction(depositAmount);
    }

    public void addTransaction(double transaction) {
        bankTransactions.add(transaction);
    }
}
