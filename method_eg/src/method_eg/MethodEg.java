package method_eg;
import java.util.*;
public class MethodEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter a number: ");
			int a =sc.nextInt();
			System.out.println(" Enter another number: ");
			int b= sc.nextInt();
			
			sample();
			add(a,b);
			
	}
	public static void sample() {
		System.out.println("\n This is asample for methods in java. ");
	}
	
	public static void add(int n1, int n2) {
		System.out.println("\n The addition of two numbers is "+(n1+n2));
	}
}
