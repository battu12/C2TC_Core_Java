// Inheritance program using constructor.

package inheritance_eg2;
import java.util.*;
public class InheritanceEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the cost of vehicle: ");
		int vehicle_cost = sc.nextInt();
		System.out.println(" Enter the milage of the vehicle: ");
		int vehicle_mileage =sc.nextInt();
		System.out.println(" Enter the car color: ");
		String car_color = sc.next();
		System.out.println(" Enter the number of tyres: ");
		int car_tyres =sc.nextInt();
		
		
		Car obj = new Car(vehicle_cost, vehicle_mileage, car_tyres, car_color);
		obj.show_vehicle_details();
		obj.show_car_details();
		}

}
