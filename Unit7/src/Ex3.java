import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) throws FileNotFoundException {
		File numbers = new File("C:\\Users\\s-phamh\\Documents\\GitHub\\AP_Comp_Sci_Unit_Exercises\\Unit7\\src\\numbers.txt");
		Scanner scan1 = new Scanner(numbers);
		ArrayList<Integer> list = new ArrayList();
		while (scan1.hasNextLine()) {
			list.add(Integer.parseInt(scan1.nextLine()));
		}
		for (int x : list) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		
		for (int i=0; i<list.size(); i++) {
			int smallest = list.get(i);
			int big_pos = 0;
			for (int j=0; j<list.size(); j++) {
				if (smallest > list.get(j)) {
					smallest = list.get(j);
				}
				big_pos = j;
			}
			swap(list, smallest, list.get(i), i, big_pos);
		}
		for (int x : list) {
			System.out.print(x + " ");
		}
	}
	
	public static void swap(ArrayList<Integer> l, int smallest, int big, int cur_pos, int big_pos) {
		int temp_s = smallest;
		l.set(cur_pos, temp_s);
		l.set(big_pos, big);
	}
}
