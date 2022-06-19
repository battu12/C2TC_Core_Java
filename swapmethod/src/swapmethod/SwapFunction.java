package swapmethod;
import java.util.*;
public class SwapFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter two numbers to swap: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		swap(x,y);
	}
	
	public static void swap(int a, int b) {
		System.out.println(" Numbers before swaping: \n a= "+a +"\n b= "+b);
		int c = a;
		a = b;
		b = c;
		
		System.out.println(" After swaping: \n a= "+a+ "\n b= "+b);
	}
}
