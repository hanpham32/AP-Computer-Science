public class Truck extends Vehicle{
	// Fields
	public static int evenNum = 2;
	public final int MAX_SPEED = 75;
	public final int WEIGHT = 16000;
	public final int gasMILEAGE = 24;
	
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
		if (x > MAX_SPEED) {
			System.out.println("Overlimit!!");
		} else {
			super.setSpeed(x);
		}
	}
	
	// ACCESSOR
	public int getMaxSpeed() {
		return MAX_SPEED;
	}
	public int getWeight() {
		return WEIGHT;
	}
	public int getGasMileage() {
		return gasMILEAGE;
	}
}
