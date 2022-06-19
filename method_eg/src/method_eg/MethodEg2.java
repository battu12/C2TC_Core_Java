package method_eg;
import java.util.*;
public class MethodEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter two numbers to multiply: ");
		int a = sc.nextInt();
		int b=sc.nextInt();
		
		MethodEg2 obj = new MethodEg2();
		
		System.out.println(obj.multiply(a, b));
	}
	
	public int multiply(int x, int y) {
		int res = x*y;
		return res;
	}
}
