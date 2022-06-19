package multiplicationtable;
import java.util.*;
public class MultiplicationTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number for table ");
		int n = sc.nextInt();
		System.out.println(" Enter a range for table ");
		int m = sc.nextInt();
		for(int i=n; i<=m; i++) {
			System.out.println("The multiplication table of "+i+":");
			for(int j=1; j<=10; j++) {
				System.out.println(i+"x"+j+"="+j*i);
			}
		}
	}

}
