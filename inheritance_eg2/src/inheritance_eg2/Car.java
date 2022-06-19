package inheritance_eg2;

public class Car extends Vehicle{
	String color ="";
	int tyres =0;
	public Car(int c, int m ,int ty, String col ) {
		super(c, m);
		// TODO Auto-generated constructor stub
		color = col;
		tyres =ty;
	}
	public void show_car_details() {
		System.out.println(" This is a car ");
		System.out.println(" Color of the car "+color);
		System.out.println(" Number of tyres in car "+tyres);
	}

}
