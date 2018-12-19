import java.text.DecimalFormat;

public class Point {
	private int x = 0;
	private int y = 0;
	
	public Point(int x, int y) {
		setPoint(x,y);
	}
	
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
	public String getPoint() {
		return "("+x+","+y+")";
	}
	
	public String findPolarCoordinates(Point one) {
		DecimalFormat df = new DecimalFormat("#.##");
		int x1 = one.getX();
		int y1 = one.getY();
		double distanceFromOrigin = Math.sqrt(x*x + y*y);
		
		double angle = Math.atan(y/x);
		return "("+df.format(distanceFromOrigin)+","+df.format(angle)+"°)";
	}
	
	public double distanceTo(Point one, Point two) {
		int x1 = one.getX();
		int x2 = two.getX();
		int y1 = one.getY();
		int y2 = two.getY();
		return Math.sqrt(Math.pow(2,x2-x1) + Math.pow(2, y2-y1));
	}
	
	public String slopeTo(Point one, Point two) {
		int GCD = 0;
		int x1 = one.getX();
		int x2 = two.getX();
		int y1 = one.getY();
		int y2 = two.getY();
		int changeInY = y2 - y1;
		int changeInX = x2 - x1;
		for (int i=1; i<(Math.abs(changeInX) > Math.abs(changeInY) ? changeInY : changeInX) ; i++) {
			if (Math.abs(changeInX)%i == 0 && Math.abs(changeInY)%i == 0) {
				GCD = i;
			}
		}
		return changeInY/GCD+"/"+changeInX/GCD;
	}
}
