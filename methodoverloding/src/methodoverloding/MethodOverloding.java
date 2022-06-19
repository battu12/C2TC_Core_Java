package methodoverloding;
import java.util.*;
public class MethodOverloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter length and breadth to calculate the area of rectangle: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(" Enter the radius of circle to find area: ");
		int r = sc.nextInt();
		
		System.out.println(area(l,b));
		System.out.println(area(r));
	}
	
	public static int area(int n1, int n2) {
		int result = n1*n2;
		return result;
	}
	
	public static double area(int n) {
		double result = Math.PI*n*n;
		return result;
	}
}
