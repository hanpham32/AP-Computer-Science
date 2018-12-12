import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		System.out.println(num);
		System.out.print("Factorial number of " + num + " is: ");
		
		// Do the calculation
		int count = 1;
		int sum = 1;
		while (count <= num){
			sum*=count;
			count++;
		}
		System.out.println(sum);
	}
}