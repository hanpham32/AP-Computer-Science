import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		int n = userIn.nextInt();
		rollDice(n);
	}
	
	public static void rollDice(int n) {
		int[] array = new int[7];
		Random rand = new Random();
		for (int i=0; i<n; i++) {
			int value = rand.nextInt(6)+1;
			array[value]++;
		}
		
		int One = array[1];
		int Two = array[2];
		int Three = array[3];
		int Four = array[4];
		int Five = array[5];
		int Six = array[6];
		
		System.out.println("One: " + One);
		System.out.println("Two: " + Two);
		System.out.println("Three: " + Three);
		System.out.println("Four: " + Four);
		System.out.println("Five: " + Five);
		System.out.println("Six: " + Six);
	}
}
