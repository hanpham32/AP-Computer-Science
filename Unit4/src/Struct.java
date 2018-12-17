
public class Struct {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private int[] point1;
	private int[] point2;
	
	public Struct() {
		x1 = 0; x2 = 0; y1 = 0; y2 = 0;
	}
	
	public Struct(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void setPoint(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double distance() {
		double distance = Math.sqrt(Math.pow(2,(x2-x1)) + Math.pow(2,(y2-y1)));
		return distance;
	}
}
