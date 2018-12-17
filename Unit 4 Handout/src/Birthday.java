public class Birthday {
	private int day;
	private int month;
	private int year;
	
	public Birthday(int m, int d, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
}
