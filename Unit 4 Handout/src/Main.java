import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Birthday date = new Birthday(03, 20, 2003);
//		AddressBook Han = new AddressBook("Han", date);
//		Han.setAddress("1234 Main St");
//		Han.setCity("Seattle");
//		Han.setState("WA");
//		System.out.println(Han);
		
		AddressBook[] book = new AddressBook[4];
		Scanner in = new Scanner(System.in);
		for (int i=0; i<book.length; i++) {
			System.out.println("Enter name: ");
			String name = in.nextLine();
			System.out.println("Enter address: ");
			String address = in.nextLine();
			System.out.println("Enter city: ");
			String city = in.nextLine();
			System.out.println("Enter state: ");
			String state = in.nextLine();
			System.out.println("Enter birth month: ");
			String birthMonth = in.nextLine();
			System.out.println("Enter birth date: ");
			String birthDay = in.nextLine();
			System.out.println("Enter birth year: ");
			String birthYear = in.nextLine();
			Birthday d = new Birthday(birthMonth, birthDay, birthYear);
			book[i] = new AddressBook(name, address, city, state, d);
		}
		
		for (int i=0; i<book.length; i++) {
			System.out.println(book[i]);
		}
	}
}
