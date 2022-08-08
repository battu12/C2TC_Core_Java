package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class testArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList ();
		list.add("BMW");
		list.add("Audi");
		list.add("Lambogini");
		list.add("Ferari");
		list.add("Landrover");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
			
		}
		System.out.println(list.get(4));
		System.out.println(list.set(1, "Bugati"));
		System.out.println(list);
	}

}
