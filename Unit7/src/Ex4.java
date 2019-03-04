import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\yunir\\eclipse-workspace\\AP_Comp_Sci_Unit_Exercises\\Unit7\\src\\names.txt");
		Scanner scan = new Scanner(f);
		ArrayList<String> list = new ArrayList();
		while (scan.hasNextLine()) {
			list.add(scan.nextLine());
		}
		for (int i=1; i<list.size();i++) {
			for (int j=i; j>0 && list.get(j).compareTo(list.get(j-1)) <= 0; j--) {
				String temp = list.get(j);
				list.set(j, list.get(j-1));
				list.set(j-1, temp);
			}
		}
		for (String x : list) {
			System.out.print(x+" ");
		} System.out.println();
		
		for (int i=1; i<list.size(); i++) {
			for (int j=i; ) {
				
			}
		}
	}
}
