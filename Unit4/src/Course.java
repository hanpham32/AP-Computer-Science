
public class Course {
	private String courseName = "";
	private String instructor = "";
	private int room = 0;
	private int period = 0;
	private String[] students;
	
	public Course(String courseName) {
		setCourseName(courseName);
	}
	public Course(String courseName, String instructorName) {
		setCourseName(courseName);
	}
	
	public void setCourseName(String s) {
		courseName = s;
	}
	public void setInstructorName(String s) {
		instructor = s;
	}
	
	public String toString() {
		return String.format("Class: %s, Instructor: %s, Room Number: %s, Period: %s", courseName, instructor, room, period);
	}
}
