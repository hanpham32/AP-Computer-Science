import java.util.Arrays;

public class Course {
	public static int totalCourses = 0;
	private String courseName = "";
	private String instructor = "";
	private int room = 0;
	private int period = 0;
	private int sPresent = 1;
	private String[] students = {"Hannah", " ", " "};
	
	public Course(String courseName) {
		setCourseName(courseName);
		totalCourses++;
	}
	public Course(String courseName, String instructorName) {
		setCourseName(courseName);
		setInstructorName(instructorName);
		totalCourses++;
	}
	
	// MUTATORS
	public void setCourseName(String s) {
		courseName = s;
	}
	public void setInstructorName(String s) {
		instructor = s;
	}
	public void setRoom(int x) {
		room = x;
	}
	public void setPeriod(int x) {
		period = x;
	}
	public void addStudent(String s) {
		students[sPresent] = s;
		sPresent++;
	}
	
	// ACCESSOR
	public String getStudents() {
		return Arrays.toString(students);
	}
	public boolean isEnrolled(String s) {
		for (int i = 0; i<students.length; i++) {
			if (students[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return String.format("Class: %s, Instructor: %s, Room Number: %s, Period: %s", courseName, instructor, room, period);
	}
}
