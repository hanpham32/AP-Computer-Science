import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(f);
		ArrayList<String> list = new ArrayList();
		while (scan.hasNextLine()) {
			list.add(scan.nextLine());
		}
<<<<<<< HEAD
		
		Scanner user = new Scanner(System.in);
		if (user.nextLine().equals("Accending")) {
			Accending(list);
		} else if (user.nextLine().equals("Decending")) {
			Decending(list);
		}
		
=======
>>>>>>> f6abc7ae51ed6e2944d1b890da60f4fdc9e776c3
		for (String x : list) {
			System.out.print(x + " ");
		} System.out.println();
		Scanner in = new Scanner(System.in);
		String user = in.nextLine();
		if (user.equals("Ascending")) {
			Ascending(list);
		} else if (user.equals("Descending")) {
			Descending(list);
		}
	}
	
<<<<<<< HEAD
	public static void Decending(ArrayList<String> list) {
=======
	public static void Descending(ArrayList<String> list) {
>>>>>>> f6abc7ae51ed6e2944d1b890da60f4fdc9e776c3
		for (int i=1; i<list.size(); i++) {
			for (int j=i; j>0 && list.get(j).compareTo(list.get(j-1)) >= 0; j--) {
				String temp = list.get(j);
				list.set(j, list.get(j-1));
				list.set(j-1, temp);
			}
		}
<<<<<<< HEAD
	}
	
	public static void Accending(ArrayList<String> list) {
=======
		for (String x : list) {
			System.out.print(x+" ");
		} System.out.println();
	}
	
	public static void Ascending(ArrayList<String> list) {
>>>>>>> f6abc7ae51ed6e2944d1b890da60f4fdc9e776c3
		for (int i=1; i<list.size();i++) {
			for (int j=i; j>0 && list.get(j).compareTo(list.get(j-1)) <= 0; j--) {
				String temp = list.get(j);
				list.set(j, list.get(j-1));
				list.set(j-1, temp);
			}
		}
<<<<<<< HEAD
		
		for (String x : list) {
			System.out.print(x+" ");
		}	
=======
		for (String x : list) {
			System.out.print(x+" ");
		} System.out.println();
>>>>>>> f6abc7ae51ed6e2944d1b890da60f4fdc9e776c3
	}
}
