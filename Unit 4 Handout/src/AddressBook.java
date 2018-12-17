
public class AddressBook {
	private String name;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	
	public AddressBook(String n) {
		name = n;
	}
	public AddressBook(String n, String a) {
		name = n;
		address = a;
	}
	public AddressBook(String n, String a, String c) {
		name = n;
		address = a;
		city = c;
	}
	public AddressBook(String n, String a, String c, String s) {
		name = n;
		address = a;
		city = c;
		state = s;
	}
	public AddressBook(String n, String a, String c, String s, int z) {
		name = n;
		address = a;
		city = c;
		state = s;
		zipcode = z;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return name + ": " + address + " " + city + " " + state + " " + zipcode;
	}
}
