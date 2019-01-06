public class Course {
	public static int totalCourses = 0;
	private String courseName = "";
	private String instructor = "";
	private int room = 0;
	private int period = 0;
	private int sPresent = 0;
	final int MAX_CLASS_SIZE = 5;
	private String[] students = new String[5];
	
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
		if ((sPresent+1) == MAX_CLASS_SIZE) { // Check if the class is full
			System.out.println("CLASS IS FULL!! CANNNOT ADD " + s);
		} else { // If not, then the student can enroll in class
			students[sPresent] = s;
		sPresent++;
		}
	}
	
	// ACCESSOR
	public String getStudents() {
		String temp = "";
		for (int i=0; i<students.length; i++) {
			if (students[i] != null) {
				temp += students[i]+" ";
			}
		}
		return temp;
	}
	public boolean isEnrolled(String s) {
		for (int i = 0; i<students.length; i++) {
			if (students[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	public boolean isClassFull() {
		if ((sPresent+1) == MAX_CLASS_SIZE) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return String.format("Class: %s, Instructor: %s, Room Number: %s, Period: %s", courseName, instructor, room, period);
	}
}
