public class Vehicle {
	// FIELDS
	private int speed = 0;
	
	public void stop() {
		System.out.println("Stopping");
	}
	
	public void start() {
		System.out.println("Starting Vehicle");
	}
	
	// MUTATOR METHODS
	public void increaseSpeed(int x) {
		this.speed += x;
	}
	public void decreaseSpeed(int x) {
		this.speed -= x;
	}
	
	// ACCESSOR METHODS
	public int getSpeed() {
		return speed;
	}
}
