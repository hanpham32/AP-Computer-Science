public class Truck extends Vehicle{
	// Fields
	public static int evenNum = 2;
	
	// Constructor
	public Truck() {
		super("T" + evenNum);
		evenNum += 2;
	}
	
	// Behaviors
	public void openTailgate() {
		System.out.println("Openning Tailgate");
	}
	
	public void closeTailgate() {
		System.out.println("Closing Tailgate");
	}
	public void setSpeed(int x) {
		if (x > 75) {
			System.out.println("Overlimit!!");
		} else {
			super.setSpeed(x);
		}
	}
}
