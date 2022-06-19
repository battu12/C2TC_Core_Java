package contructor_eg;
import java.util.*;
public class Vehicle {

	static Scanner sc = new Scanner(System.in);
	String color = "";
	int vehicle_cost = 0;
	public Vehicle(String c, int p) {
		color=c;
		vehicle_cost = p;
	}
	public void show_details() {
		System.out.println(" The cost of the vehicle is "+vehicle_cost);
		System.out.println(" The color of the vehicle is "+color);
	}
	
	public static void main(String[] args) {
		
		System.out.println(" Enter the cost of the vehicle: ");
		int my_cost = sc.nextInt();
		System.out.println(" Enter the color of the vehicle: ");
		String vh_color = sc.next();
		Vehicle obj = new Vehicle(vh_color, my_cost); 
		obj.show_details();
	}
}



