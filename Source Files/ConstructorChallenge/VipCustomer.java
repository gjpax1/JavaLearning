public class VipCustomer {

    private double creditLimit;
    private String name;
    private String emailAddress;

    public VipCustomer() {
        this(100000.00, "Greg", "Greg@email.com");
    }

    public VipCustomer(double creditLimit, String name, String emailAddress) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(double creditLimit, String name) {
        this(creditLimit, name, "Greg@email.com");

    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getName() {
        return this.name;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
