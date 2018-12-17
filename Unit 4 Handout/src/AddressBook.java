public class AddressBook {
	private String name;
	private String address;
	private Birthday birthday;
	private static int contacts = 0;
	
	public AddressBook(String n) {
		this(n, "");
	}
	public AddressBook(String n, String a) {
		this.name = n;
		this.address = a;
		this.contacts++;
	}
	public AddressBook(String n, Birthday d) {
		this.name = n;
		this.birthday = d;
		contacts++;
	}
	
	// ACCESSOR
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	// MUTATOR
	public void setName(String n) {
		this.name = n;
	}
	public void setAddress(String a) {
		this.address = a;
	}
	public void setBirthday(Birthday d) {
		birthday = d;
	}
	
	public String toString() {
		return String.format("name: %s || address: %s || birhtday: %s || record: %d", name, address, birthday, contacts);
	}
}
