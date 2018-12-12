import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(" Now, is, a good time, to get this done");
		input.useDelimiter(",");
		while (input.hasNext()) {
			System.out.println(input.next());
		}
		
		input.close();
	}
}