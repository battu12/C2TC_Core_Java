package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList Ll = new LinkedList ();
		Ll.add(10);
		Ll.add(new Integer(5));
		Ll.add(new String("Hello"));
		Ll.addFirst(25);
		Iterator it=Ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Ll.remove();
		Ll.removeLast();
		System.out.println("After removing elements");
		System.out.println(Ll);
	}

}
