package multiple_inheritance;

public class Person {
	String name = "";
	int age = 0;
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	public void show_person_details() {
		System.out.println(" The name of the person is"+name+".");
		System.out.println(" The age of "+ name + " is "+age+".");
	}
}
