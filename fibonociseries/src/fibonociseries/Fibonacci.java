package fibonociseries;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a range: ");
		int n = sc.nextInt();
		int firstterm=0,sec_term=1;
		System.out.println(" Fibonacci series for"+" " +n +" "+"numbers is");
		for(int i=1;i<=n;i++){
			System.out.println(firstterm);
			int nxtterm=firstterm+sec_term;
			firstterm=sec_term;
			sec_term=nxtterm;
		}
	}

}
