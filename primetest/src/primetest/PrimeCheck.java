package primetest;
import java.util.Scanner;
public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number to check whether it is prime or not ");
		int num = sc.nextInt();
		boolean prime = true;
		for(int i=2;i<num;++i) {
				if(num%i==0)
				{
					prime = false;
				}
				}
		if(prime) {
			System.out.println(" the number "+ num + " is a prime number. ");
			
			}else {
				System.out.println(" The number "+ num+ " is not a prime number.");
			
			}
	
		
	
	}
}
