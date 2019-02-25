import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\s-phamh\\Documents\\GitHub\\AP_Comp_Sci_Unit_Exercises\\Unit7\\src\\namesearch.txt");
		Scanner scan = new Scanner(f);
		ArrayList<String> aList = new ArrayList();
		while (scan.hasNextLine()) {
			aList.add(scan.nextLine());
		}
		String[] a = new String[aList.size()];
		for (int i=0; i<aList.size(); i++) {
			a[i] = aList.get(i);
		}
		for (String x : a) {
			System.out.print(x+ " ");
		}
		System.out.println();
		System.out.println("Index of Dennis: " + Arrays.binarySearch(a, "Dennis"));
		System.out.println("Index of Billy-Bob: " + Arrays.binarySearch(a, "Billy-Bob"));
		System.out.println("Index of Steve: " + Arrays.binarySearch(a, "Steve"));
	}
}
