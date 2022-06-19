package test_pgrm;
import java.util.*;
public class SignOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a numer to check positive or negative: ");
		int n = sc.nextInt();
		if(n>0) {
			System.out.println(n+" is positive number.");
		}else if(n<0) {
			System.out.println(n+" is negative number. ");
		}else {
			System.out.println(" Number is zero.");
		}
	
	}

}
