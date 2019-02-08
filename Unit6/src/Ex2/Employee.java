package Ex2;

import java.io.File;
import java.util.ArrayList;

public class Employee {
	private int ID;
	private String firstName;
	private String lastName;
	private int birthDay = 00;
	private int birthMonth = 00;
	private int birthYear = 0000;
	public ArrayList<String> skills = new ArrayList();
	public ArrayList<String> projects = new ArrayList();
	
	// Mutator Methods
	public void setID(int id) {
		this.ID = id;
	}
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	public void setLastName(String lName) {
		this.lastName = lName;
	}
	public void setBirthDay(int x) {
		this.birthDay = x;
	}
	public void setBirthMonth(int x) {
		this.birthMonth = x;
	}
	public void setBirthYear(int x) {
		this.birthYear = x;
	}
	
	// Getter Methods
	public int getID() {
		return ID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public ArrayList<String> getSkills() {
		return skills;
	}
	public ArrayList<String> getProjects(){
		return projects;
	}
	
	public String toString() {
		return String.format("ID: %s, First Name: %s, Last Name: %s, Birthday: %s/%s/%s, Skill: %s, Project: %s", ID, firstName, lastName, birthMonth, birthDay, birthYear, skills, projects);
	}
}
