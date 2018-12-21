import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Course Math = new Course("Algebra 2", "Ms. M");
		Math.setRoom(231);
		Math.setPeriod(6);
		System.out.println(Math);
	}
}
