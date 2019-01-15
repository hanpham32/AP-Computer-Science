package Shapes;

public class Rectangle implements Shape{
	private double width;
	private double height;

	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width+height)*2;
	}

}
