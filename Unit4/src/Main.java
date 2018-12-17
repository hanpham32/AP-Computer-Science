public class Main {
	public static void main(String[] args) {
		Point point1 = new Point();
		Point point2 = new Point();
		point1.setPoint(2, 2);
		point2.setPoint(4, 5);

		System.out.println(point1.findDistance(point1, point2));
	}
}
