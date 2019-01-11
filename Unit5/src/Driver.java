
public class Driver {
	public static void main(String[] args) {
		Truck a = new Truck();
		Car b = new Car();
		
		System.out.println(a.getMaxSpeed());
		System.out.println(b.getMaxSpeed());
		
		System.out.println(a.getWeight());
		System.out.println(b.getWeight());
	}
}
