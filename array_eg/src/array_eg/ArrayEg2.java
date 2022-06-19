package array_eg;
import java.util.*;
public class ArrayEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter an index value for an array: ");
		int n = sc.nextInt();
		
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]= i;
		}
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}

}
