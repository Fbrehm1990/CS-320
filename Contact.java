
public class Contact {

	// create string for id
	private String id;
	
	// create string for first name
	private String firstName;
	
	// create string for last name
	private String lastName;
	
	// create string for phone number
	private String phoneNumber;
	
	// create string for address
	private String address;
	
	// create Contact
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		
		// check to ensure id is under 10 characters
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		// check to ensure first name is under 10 characters
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		// check to ensure last name is under 10 characters
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
		// check to ensure phone number is under 10 characters
		if(phoneNumber == null || phoneNumber.length()>10) {
			throw new IllegalArgumentException("Invalid phoneNumber");
		}
		
		// check to ensure address is under 30 characters
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		// create constructor methods
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
		
	}
	
	// create the get and set methods
	public String getId() {
		return id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber == null || phoneNumber.length()>10) {
			throw new IllegalArgumentException("Invalid phoneNumber");
		}
		
	public String address() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
	}
	}
	}
}
