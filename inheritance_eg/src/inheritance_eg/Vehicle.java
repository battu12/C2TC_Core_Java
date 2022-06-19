package inheritance_eg;
import java.util.*;
public class Vehicle {
	 String brand = "";
	 int milage = 0;
	 Scanner sc = new Scanner(System.in);
	  public void get_details() {                    
	    System.out.println(" Enter the brand name: ");
	    brand = sc.next();
	    System.out.println(" Enter the milage: ");
	    milage = sc.nextInt();  
	  }
	  public void show_details() {
		  System.out.println("The brand is "+ brand);
		  System.out.println(" The milage is: "+milage);
	  }
}	  