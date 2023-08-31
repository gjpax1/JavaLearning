import java.util.ArrayList;

public class BranchLocation {

    private String branchName;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public BranchLocation(String name) {
        this.branchName = name;
    }

    public BranchLocation(String branchName, ArrayList<Customer> customerList) {
        this.branchName = branchName;
        this.customerList = customerList;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public static BranchLocation createBranchLocation(String name) {
        return new BranchLocation(name);
    }

    public void addCustomer(String name, String phoneNumber, double bankBalance) {
        customerList.add(Customer.newCustomer(name, phoneNumber, bankBalance));
    }

    public void displayCustomers () {
        for (int i = 0; i < this.customerList.size(); i++) {
            System.out.println("Customer " + (i + 1) + " = " + customerList.get(i).getName());
        }
    }


}
