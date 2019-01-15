package Shapes;

import java.text.DecimalFormat;

public class Circle implements Shape {
	private double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double getArea() {
		DecimalFormat df = new DecimalFormat(".00");
		return Double.parseDouble(df.format(Math.PI * Math.pow(radius, 2)));
	}

	public double getPerimeter() {
		DecimalFormat df = new DecimalFormat(".00");
		return Double.parseDouble(df.format(2 * Math.PI * radius));
	}

}
