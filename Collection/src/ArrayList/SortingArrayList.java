package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List <String> list =new ArrayList <String> ();
		 
		 list.add("BMW");
		 list.add("Audi");
		 list.add("Lambogini");
		 list.add("Landrover");
		 Collections.sort(list);
		 System.out.println("After sorting");
		 Iterator itr=list.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 System.out.println();
		 
		 ArrayList<Integer> al= new ArrayList<Integer>();
		 
		 al.add(5);
		 al.add(2);
		 al.add(7);
		 al.add(3);
		 
		 Collections.sort(al);
		 System.out.println("The sorted numbers are");
		
		for(Integer numbers:al)
		{
			System.out.println(numbers);
		}
	}

}
