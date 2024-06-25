import java.util.ArrayList;

// create public class ContactService
public class ContactService {

	// create list for data
	ArrayList<Contact> list = new ArrayList<Contact>();
	
	// create boolean to determine if true
	public boolean addContact(Contact contact) {
		boolean added = false;
		
		// if statement to determine if added to list
		if (list.size() == 0) {
			list.add(contact);
			added = true;
		}
		else {
			
			// for statement to cycle through list
			for(Contact c : list) {
				if (contact.getId().equalsIgnoreCase(c.getId())) {
					return added;
				}
			}
			// end of for loop
			
			list.add(contact);
			added = true;
		}
		
		return added;
	}
}
