import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = input.nextLine();
		System.out.println("Enter 'n' or 'p' or anything else to quit");
		String shift = input.nextLine();
		String shifted = "";
		if (shift.equals("n")) {
			for (int i=0; i <= text.length()-1; i++) {
				char temp = text.charAt(i);
				shifted += (temp += 1);
			}
			System.out.println(shifted);
		} else if (shift.equals("p")) {
			for (int i=0; i<= text.length()-1; i++) {
				char temp = text.charAt(i);
				if (temp == 97) {
					shifted += temp = 122;
				} else {
					shifted += (temp -= 1);
				}
			}
			System.out.println(shifted);
		} else {
			System.out.println(text);
		}
		input.close();
	}
}