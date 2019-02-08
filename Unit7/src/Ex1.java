import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\s-phamh\\Documents\\GitHub\\AP_Comp_Sci_Unit_Exercises\\Unit7\\src\\numsearch.txt");
		Scanner input = new Scanner(f);
		int count = 0;
		while (input.hasNextLine()) {
			int num = Integer.parseInt(input.nextLine());
			if (num == 7 || num == 9 || num == 49) {
				count++;
			}
		}
		System.out.printf("Numbers 7, 9 and 49 appear: %s times", count);
	}
}
