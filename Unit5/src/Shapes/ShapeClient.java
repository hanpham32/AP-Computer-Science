package Shapes;
public class ShapeClient {
	public static void main(String[] args) {
		Shape[] array = new Shape[3];
		array[0] = new Rectangle(3,5);
		array[1] = new Triangle(3,4,5);
		array[2] = new Circle(4);
		
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i].getArea());
			System.out.println(array[i].getPerimeter());
			System.out.println();
		}
	}
}
