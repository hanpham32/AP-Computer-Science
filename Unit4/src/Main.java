public class Main {
	public static void main(String[] args) {
		Course Math = new Course("Algebra 2", "Ms. M");
		Math.setRoom(231); Math.setPeriod(6);
		System.out.println(Math);
		Math.addStudent("bucky");
		Math.addStudent("tuna");
		System.out.println(Math.getStudents());
		System.out.println(Math.isEnrolled("bucky"));
		
		Course History = new Course("World History", "Mr. H");
		History.setRoom(218); Math.setPeriod(5);
		System.out.println(History);
		
		System.out.println(Course.totalCourses);
	}
}
