package Ex2;

import java.io.File;
import java.util.ArrayList;

public class Employee {
	public int ID;
	private String firstName;
	private String lastName;
	private int birthDay = 00;
	private int birthMonth = 00;
	private int birthYear = 0000;
	public ArrayList<String> skills = new ArrayList();
	public ArrayList<String> projects = new ArrayList();
	
	public void setID(int id) {
		this.ID = id;
	}
	
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	
	public void setLastName(String lName) {
		this.lastName = lName;
	}
	
	public void setName(String f, String l) {
		firstName = f;
		lastName = l;
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
	
}
