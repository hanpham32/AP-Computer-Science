import java.util.Scanner;
public class Exercise11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 1;
		int count = 0;
		int sum = 0;
		while (num > 0) {
			num = input.nextInt();
			if (num > 0) {
				sum += num;
				count++;
			} else {
				System.out.println("Done");
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println(count + " num entered");
	}
}