import java.util.ArrayList;
public class MobilePhone {

    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void addContact(Contact contact){
        contactList.add(contact);
        System.out.println(contact.getName() + " with phone number " + contact.getPhoneNumber() + " has been added your your contact list!");
    }

//    public void modifyContact(Contact contact){
//        contactList.set(contactList.indexOf());
//        //System.out.println(nameAndPhone + " was modified in your Contact list to " + newItem);
//    }

    private int findContact (String contactName) {
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact (Contact contact) {
        return this.contactList.indexOf(contact);
    }

    public boolean removeContact (Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.contactList.remove(foundPosition);
        System.out.println(contact + " was removed from your Contact List");
        return true;
    }

    public void printContactList () {
        System.out.println("You have " + contactList.size() + " contacts in your phone");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(i+1 + ". " + contactList.get(i).getName());

        }
    }
}
