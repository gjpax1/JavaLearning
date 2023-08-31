public class Main {
    public static void main(String[] args) {
//        BankAccount myBankAccount = new BankAccount("12345", 0.00, "Greg P", "myemail@email.com", "(123) 23)");
//        System.out.println(myBankAccount.getAccountNumber());
//        System.out.println(myBankAccount.getBalance());
//        System.out.println(myBankAccount.depositFunds(50.00));
//        System.out.println(myBankAccount.withdrawalFunds(20.00));
//        System.out.println(myBankAccount.withdrawalFunds(60.00));
//
//        BankAccount gregsAccount = new BankAccount("Greg", "greg@gmail.com", "12345");
//        System.out.println(gregsAccount.getAccountNumber());
//        System.out.println(gregsAccount.getCustomerName());
//
//        VipCustomer greg = new VipCustomer();
//        System.out.println(greg.getName());

        VipCustomer lauren = new VipCustomer(2000000, "Lauren");
        System.out.println(lauren.getCreditLimit());
        System.out.println(lauren.getEmailAddress());
        System.out.println(lauren.getName());
    }
}