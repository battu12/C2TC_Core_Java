package inheritance_eg;
import java.util.*;
public class Car extends Vehicle{
	
	 int  cost = 0;
	 String color = "";
	 Scanner sc = new Scanner(System.in);
	  public void car_details() {                    
	    System.out.println(" Enter the color of the car: ");
	    color = sc.next();
	    System.out.println(" Enter the cost of the car: ");
	    cost = sc.nextInt();  
	  }
	  public void show_car_details() {
		  System.out.println("The color is "+ color);
		  System.out.println(" The cost is: "+cost);
	  }

}
