package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] arsg) {
		File f = new File("C:\\Users\\yunir\\eclipse-workspace\\AP_Comp_Sci_Unit_Exercises\\Unit6\\src\\Ex2\\employee.txt");
		try {
			Scanner in = new Scanner(f);
			
			ArrayList<Employee> employees = new ArrayList(10);
			int count = 0;
			while(in.hasNext()) {
				Employee em = new Employee();
				employees.add(em);
				
				// Break down each line
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
				
				// Add values
				em.setID(ID);
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
			System.out.println();
			System.out.println("People who has Support skill:");
			commonSkills(employees, "Support");
			System.out.println();
			System.out.println("People who works on ProjectZ:");
			commonProjects(employees, "ProjectZ");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void commonSkills(ArrayList<Employee> a, String s) {
		for (Employee x : a) {
			for (String skill : x.getSkills()) {
				if (skill.equals(s)) {
					System.out.println(x.getFirstName() + " " + x.getLastName());
				}
			}
		}		
	}
	
	public static void commonProjects(ArrayList<Employee> a, String s) {
		for (Employee x : a) {
			for (String project : x.getProjects()) {
				if (project.equals(s)) {
					System.out.println(x.getFirstName() + " " + x.getLastName());
				}
			}
		}
	}
}
