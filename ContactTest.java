import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// create class to test contact
class ContactTest {
	Contact contact = new Contact("A", "Bob", "Bobble", "1112223333", "123 Address Lane");

	// testing ID
	@Test
	void getID() {
		assertEquals("A", contact.getId());
	}
	
	// testing first name
	@Test
	void getFirstName() {
		assertEquals("Bob", contact.getFirstName());
	}
	
	// testing last name
	@Test
	void getLastName() {
		assertEquals("Bobble", contact.getLastName());
	}
	
	// testing phone number
	@Test
	void getPhoneNumber() {
		assertEquals("1112223333", contact.getPhoneNumber());
	}
	
	// testing address
	@Test
	void getAddress () {
		assertEquals("123 Address Lane", contact.getAddress());
	}
	
	// testing string as a whole
	@Test
	void testString() {
		assertEquals("Contact [ID = A, FirstName = Bob, LastName = Bobble, PhoneNumber = 1112223333, Address = 123 Address Lane]",contact.String());
		
	}
}
