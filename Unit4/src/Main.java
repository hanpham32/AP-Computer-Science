public class Main {
	public static void main(String[] args) {
		Course Math = new Course("Algebra 2", "Ms. M");
		Math.setRoom(231); Math.setPeriod(6);
		System.out.println(Math);
		Math.addStudent("Bucky");
		Math.addStudent("Tuna");
		System.out.println("List of students in Math class: " + Math.getStudents());
		
		Course History = new Course("World History", "Mr. H");
		History.setRoom(218); Math.setPeriod(5);
		System.out.println(History);
		
		System.out.println(Course.totalCourses + " courses had been created"); 
		// This will print out how many Courses have been created
		
		System.out.println("Is Math class full? " + Math.isClassFull());
		
		Math.addStudent("Apple");
		Math.addStudent("Banana");
		Math.addStudent("Juice");
		System.out.println("Is Apple in Math class? " + Math.isEnrolled("Apple"));

	}
}
