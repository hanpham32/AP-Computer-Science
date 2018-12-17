public class Main {
	public static void main(String[] args) {
		Birthday date = new Birthday(03, 20, 2003);
		AddressBook Han = new AddressBook("Han", date);
		Han.setAddress("1234 Main St");
		Han.setCity("Seattle");
		Han.setState("WA");
		System.out.println(Han);
	}
}
