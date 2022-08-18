import java.util.*;
public class RecursionEg3 {
	static int n1=0,n2=1,n3=0;
	
	static void printFibo(int count)
	{
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			printFibo(count-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number for count: ");
		int num = sc.nextInt();
		int count=num;
		System.out.println(n1  +  n2);
		printFibo(count-2);
	}

}
