package Shapes;
public class Triangle implements Shape {
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getArea() {
		double base = 2 * (a/b);
		return base*b/2;
	}

	public double getPerimeter() {
		return a+b+c;
	}

}
