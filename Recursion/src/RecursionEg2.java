import java.util.*;
public class RecursionEg2 {
	
	static int count=0;
		
	static void p()
	{
		count++;
		if(count<=5)
		{
			System.out.println("Finite nuber of times " + count);
			p();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		p();
		
	}

}
