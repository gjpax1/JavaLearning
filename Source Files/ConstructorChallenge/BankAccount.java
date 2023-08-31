public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount () {
        this("56789", 2.50, "Default email","Default name", "default phone");
        System.out.println("Empty constructor called");

    }
    public  BankAccount (String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String depositFunds (double depositAmount) {
        this.balance += depositAmount;
        return "New Account Balance is " + this.balance;
    }

    public String withdrawalFunds (double withdrawalAmount) {
        if ((this.balance - withdrawalAmount) < 0) {
            return "Insufficient Funds";
        } else {
            this.balance -= withdrawalAmount;
            return "New Account Balance is " + this.balance;
        }
    }
}
