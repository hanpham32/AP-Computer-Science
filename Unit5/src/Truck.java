public class Truck extends Vehicle{
	public static int evenNum = 2;
	
	// Constructor
	public Truck() {
		setLicensePlate("T" + evenNum);
		evenNum += 2;
	}
	
	public void openTailgate() {
		System.out.println("Openning Tailgate");
	}
	
	public void closeTailgate() {
		System.out.println("Closing Tailgate");
	}
}
