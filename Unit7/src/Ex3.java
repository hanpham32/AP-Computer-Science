import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\s-phamh\\Documents\\GitHub\\AP_Comp_Sci_Unit_Exercises\\Unit7\\src\\numbers.txt");
		Scanner scan = new Scanner(f);
		ArrayList<Integer> list = new ArrayList();
		while (scan.hasNextLine()) {
			list.add(Integer.parseInt(scan.nextLine()));
		}
		int smallest_index = 0;
		int j = 1;
		for (int i=0; i<list.size(); i++) {
			if (list.get(smallest_index) > list.get(j)) {
				swap(list, smallest_index,j);
			} else {
				j++;
			}
		}
		
		for (int x : list) {
			System.out.print(x + " ");
		}
	}
	
	public static void swap(ArrayList<Integer> l, int smallest, int i) {
		int temp = smallest;
		l.set(smallest, i);
		l.set(i, temp);
	}
}
