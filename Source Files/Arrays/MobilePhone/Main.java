public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.addContact(new Contact("Lauren", "239-123-4567"));
        mobilePhone.addContact(new Contact("Mom", "239-765-4321"));
        mobilePhone.addContact(new Contact("Friend", "239-555-5555"));
        mobilePhone.printContactList();


    }
}