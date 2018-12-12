import java.util.Scanner;
public class Exercise16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String user = in.nextLine();
		StringBuilder str = new StringBuilder(user);
		int length = str.length()-2;
		str = str.insert(length, ".");
		System.out.println("String: " + str);
		in.close();
	}
}

