package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] arsg) {
		File f = new File("C:\\Users\\s-phamh\\Documents\\GitHub\\AP_Comp_Sci_Unit_Exercises\\Unit6\\src\\Ex2\\employee.txt");
		try {
			Scanner in = new Scanner(f);
			
			ArrayList<Employee> employees = new ArrayList(10);
			int count = 0;
			while(in.hasNext()) {
				Employee em = new Employee();
				employees.add(em);
				
				String line = in.nextLine();
				String[] s = line.split(";");
				int ID = Integer.parseInt(s[0]);
				String[] Name = s[1].split(" ");
				String firstName = Name[0];
				String lastName = Name[1];
				String[] Birthday = s[2].split("/");
				int month = Integer.parseInt(Birthday[0]);
				int day = Integer.parseInt(Birthday[1]);
				int year = Integer.parseInt(Birthday[2]);
				String[] Skills = s[3].split(",");
				String[] Projects = s[4].split(",");
				
				em.ID = ID;
				em.setFirstName(firstName);
				em.setLastName(lastName);
				em.setBirthDay(day);
				em.setBirthMonth(month);
				em.setBirthYear(year);
				for (String i : Skills) {
					em.skills.add(i);
				}
				for (String i : Projects) {
					em.projects.add(i);
				}				
			}
			System.out.println(employees.get(0));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
