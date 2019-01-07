public class Birthday {
	private int day;
	private int month;
	private int year;
	
	public Birthday(String m, String d, String y) {
		this.day = Integer.parseInt(d);
		this.month = Integer.parseInt(m);
		this.year = Integer.parseInt(y);
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
}
