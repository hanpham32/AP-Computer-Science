import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Birthday date = new Birthday(03, 20, 2003);
		AddressBook Han = new AddressBook("Han", date);
		Han.setAddress("1234 Main St");
		Han.setCity("Seattle");
		Han.setState("WA");
		System.out.println(Han);
		
		AddressBook[] book = new AddressBook[3];
		Scanner in = new Scanner(System.in);
		for (int i=0; i<book.length; i++) {
			String name = in.next();
			String address = in.next();
			String city = in.next();
			String state = in.next();
			int birthMonth = in.nextInt();
			int birthDay = in.nextInt();
			int birthYear = in.nextInt();
			Birthday d = new Birthday(birthMonth, birthDay, birthYear);
			book[i] = new AddressBook(name, address, city, state, d);
		}
	}
}
