package Vehicles;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;

public class Driver {
	public static void main(String[] args) {
		Car a = new Car();
		Truck b = new Truck();
		Circle c = new Circle(5);
		Rectangle d = new Rectangle(3,5);
		
		System.out.println(a instanceof Vehicle);
		System.out.println(b instanceof Vehicle);
		System.out.println(a instanceof Shape);
		System.out.println(c instanceof Shape);
		System.out.println(d instanceof Shape);
//		System.out.println(c instanceof Vehicle);
	}
}
