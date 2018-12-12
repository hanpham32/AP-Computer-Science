import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\s-phamh\\eclipse-workspace\\Unit3\\src\\Chap6Ex13.txt");
		try {
			Scanner scan = new Scanner(f);
			stripComments(scan);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void stripComments(Scanner file) throws FileNotFoundException {
		PrintStream out = new PrintStream(new File("StrippedComments.txt"));
		while(file.hasNextLine()) {
			String str = file.nextLine();
			if (!str.contains("//") && !str.contains("/*")) {
				out.println(str);
			}
			if (str.contains("/*")) {
				while (!str.contains("*/")) {
					str = file.nextLine();
				}
				str = file.nextLine();
				out.println(str);
			}
		}
	}
}
	

