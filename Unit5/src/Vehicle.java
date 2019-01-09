public class Vehicle {
	// FIELDS
	private int speed = 0;
	private String licensePlate = "";
	
	// Constructor
//	public Vehicle(String s) {
//		setLicensePlate(s);
//	}
	
	// Behaviors
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
	public void setLicensePlate(String s) {
		this.licensePlate = s;
	}
	
	// ACCESSOR METHODS
	public int getSpeed() {
		return speed;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
}
