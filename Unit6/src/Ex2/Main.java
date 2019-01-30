package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] arsg) {
		File f = new File("C:\\Users\\s-phamh\\Documents\\GitHub\\AP_Comp_Sci_Unit_Exercises\\Unit6\\src\\Ex2.employee.txt");
		try {
			Scanner in = new Scanner(f);
			
			ArrayList<Employee> employees = new ArrayList();
			for (int i=0; i<=employees.size(); i++) {
				employees.set(i, new Employee());
			}
			int count = 0;
			while(in.hasNext()) {
				String line = in.nextLine();
				String[] s = line.split(";");
				int ID = Integer.parseInt(s[0]);
				String[] Name = s[1].split(" ");
				String firstName = Name[0];
				String lastName = Name[1];
				String[] Birthday = s[2].split("/");
				String month = Birthday[0];
				String day = Birthday[1];
				String year = Birthday[2];
				
				
				Employee em = employees.get(count);
				em.ID = Integer.parseInt(s[0]);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
