import java.text.DecimalFormat;

public class Point {
	private int x = 0;
	private int y = 0;
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public String findDistance(Point one, Point two) {
		int x1 = one.getX();
		int x2 = two.getX();
		int y1 = one.getY();
		int y2 = two.getY();
		double distance = Math.sqrt(Math.pow(2,x2-x1) + Math.pow(2, y2-y1));
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(distance);
	}
}
