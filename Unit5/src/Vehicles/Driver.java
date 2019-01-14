package Vehicles;
public class Driver {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Truck();
		vehicles[1] = new Car();
		
		for (int i=0; i<vehicles.length; i++) {
			System.out.println(vehicles[i].getMaxSpeed());
			System.out.println(vehicles[i].getWeight());
			System.out.println(vehicles[i].getGasMileage());
			System.out.println();
		}
	}
}
