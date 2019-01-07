public class AddressBook {
	private String name;
	private String address = "";
	private String city = "";
	private String state = "";
	private String zipcode = "";
	private Birthday birthday;
	private static int contacts = 0;
	
	public AddressBook() {
		
	}
	public AddressBook(String name) {
		this.name = name;
	}
	public AddressBook(String n, String a, String c, String s, String z) {
		this.name = n;
		this.address = a;
		this.city = c;
		this.state = s;
		this.zipcode = z;
		contacts++;
	}
	public AddressBook(String n, String a, String c, String s, Birthday d) {
		this.name = n;
		this.address = a;
		this.city = c;
		this.state = s;
		this.birthday = d;
		contacts++;
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
		return address + " " + city + " " + state + " " + zipcode;
	}
	
	// MUTATOR
	public void setName(String n) {
		this.name = n;
	}
	public void setAddress(String a) {
		this.address = a;
	}
	public void setCity(String c) {
		this.city = c;
	}
	public void setState(String s) {
		this.state = s;
	}
	public void setZipcode(String z) {
		this.zipcode = z;
	}
	public void setBirthday(Birthday d) {
		birthday = d;
	}
	
	public String toString() {
		return String.format("name: %s || address: %s %s %s %s || birhtday: %s || record: %d", name, address, city, state, zipcode, birthday, contacts);
	}
}
