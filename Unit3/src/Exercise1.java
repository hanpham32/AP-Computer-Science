import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\s-phamh\\eclipse-workspace\\Unit3\\src\\Chap6Ex2.txt");
		try {
			Scanner scan = new Scanner(f);
			EvenNumbers(scan);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void EvenNumbers(Scanner nums) {
			int count = 0,sum = 0, countOdd = 0, countEven = 0;
			while (nums.hasNextInt()) {
				int num = nums.nextInt();
				count++;
				sum += num;
				if (num % 2 == 0) {
					countEven++;
				} else {
					countOdd++;
				}
			}
			System.out.println("Total: " + count);
			System.out.println("Sum: " + sum);
			System.out.println("Even: " + countEven);
			System.out.println("Odd: " + countOdd);
	}
}

