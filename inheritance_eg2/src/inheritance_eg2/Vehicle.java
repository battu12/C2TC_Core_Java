package inheritance_eg2;

public class Vehicle {
	int cost = 0;
	int mileage = 0;
	
	public Vehicle(int c, int m) {
		cost = c;
		mileage = m;
	}
	public void show_vehicle_details() {
		System.out.println(" This is a vehicle. ");
		System.out.println(" Cost of the vehicle "+cost);
		System.out.println(" Mileage of the vehicle "+ mileage);
	}
}
