
public class Driver {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Truck truck = new Truck();
		Vehicle a = new Car();
		Vehicle b = new Truck();
//		Car c = new Vehicle();
//		Truck d = new Car();
//		Car c = new Truck();
		Vehicle d = new Car();
		
		vehicle.increaseSpeed(35);
		System.out.println("vehicle's current speed: " + vehicle.getSpeed());

		
		car.increaseSpeed(35);
		System.out.println("car's current speed: " + car.getSpeed());
		
		truck.increaseSpeed(35);
		System.out.println("truck's current speed: " + truck.getSpeed());
		
		a.increaseSpeed(35);
		System.out.println("a's current speed: " + a.getSpeed());
		
		b.increaseSpeed(35);
		System.out.println("b's current speed: " + b.getSpeed());
		
		((Car) d).openTrunk();
//		c.closeTailgate();
	}
	
}

/* 
4. Objects c and d examples above don't work because we cannot cast Superclass to Subclass
only Subclass to Superclass. 
*/