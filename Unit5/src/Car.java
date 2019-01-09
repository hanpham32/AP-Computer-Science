
public class Car extends Vehicle{
	public static int oddNum = 1;
	
	// Constructor
	public Car() {
		super("C" + oddNum);
		oddNum += 2;
	}
	
	// Behaviors
	public void openTrunk() {
		System.out.println("Opening Trunk");
	}
	
	public void closeTrunk( ) {
		System.out.println("Closing Trunk");
	}
}
