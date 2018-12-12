import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		int n = userIn.nextInt();
		rollDice(n);
	}
	
	public static void rollDice(int n) {
		int[] array = new int[13];
		Random rand = new Random();
		for (int i=0; i<n; i++) {
			int value1 = rand.nextInt(6)+1;
			int value2 = rand.nextInt(6)+1;
			int sum = value1 + value2;
			array[sum]++;
		}
		System.out.println("One: " + array[1]);
		System.out.println("Two: " + array[2]);
		System.out.println("Three: " + array[3]);
		System.out.println("Four: " + array[4]);
		System.out.println("Five: " + array[5]);
		System.out.println("Six: " + array[6]);
		System.out.println("Seven: " + array[7]);
		System.out.println("Eight: " + array[8]);
		System.out.println("Nine: " + array[9]);
		System.out.println("Ten: " + array[10]);
		System.out.println("Eleven: " + array[11]);
		System.out.println("Twelve: " + array[12]);
	}
}
