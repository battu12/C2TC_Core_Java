package multiplicationtable;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number for table ");
		int n = sc.nextInt();
		System.out.println(" Multiplication table of "+n+":");
		for(int i=1; i<=10; i++) {
			System.out.println(n+"x"+i+"="+i*n);
		}
	}

}
