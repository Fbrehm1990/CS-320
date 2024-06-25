import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for ContactService methods
public class ContactServiceTest {

    // Test to add contact
    @Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("A", "Bob", "Bobble", "1112223333", "123 Address Lane");
        contactService.addContact(contact);
        
        // Assert if contact can be accessed
        assertEquals(contact, contactService.getContact("A"));
    }

    // Test to delete a contact
    @Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("A", "Bob", "Bobble", "1112223333", "123 Address Lane");
        contactService.addContact(contact);
        contactService.deleteContact("1112223333");

        // See if deleted contact is still there
        assertNull(contactService.getContact("A"));
    }

    // Test to update the first name of a contact
    @Test
    public void testUpdateFirstName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("A", "Bob", "Bobble", "1112223333", "123 Address Lane");
        contactService.addContact(contact);
        contactService.updateFirstName("A", "Bob");

        // check to see if name updated
        assertEquals("Jane", contactService.getContact("A").getFirstName());
    }

    // Test to update the last name of a contact
    @Test
    public void testUpdateLastName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("A", "Bob", "Bobble", "1112223333", "123 Address Lane");
        contactService.addContact(contact);
        contactService.updateLastName("A", "Bobble");

        // check to see if last name updated
        assertEquals("Bobble", contactService.getContact("A").getLastName());
    }

    // Test to update the phone number of a contact
    @Test
    public void testUpdatePhone() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("A", "Bob", "Bobble", "1112223333", "123 Address Lane");
        contactService.addContact(contact);
        contactService.updatePhone("A", "3332221111");

        // check to see if phone number is updated correctly
        assertEquals("3332221111", contactService.getContact("A").getPhone());
    }

    // Test to update the address of a contact
    @Test
    public void testUpdateAddress() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("A", "Bob", "Bobble", "1112223333", "123 Address Lane");
        contactService.addContact(contact);
        contactService.updateAddress("A", "123 Address Street");

        // check to see that the address is updated correctly
        assertEquals("123 Address Street", contactService.getContact("A").getAddress());
    }
}