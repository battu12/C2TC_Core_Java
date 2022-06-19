package test_pgrm;
import java.util.*;
public class If_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter two number to compare: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x> y) {
			System.out.println(x+ " is greater. ");
		}else {
			System.out.println(y+ " is greater. ");
		}
	}

}
