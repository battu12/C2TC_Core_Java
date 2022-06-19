package classtest;
import java.util.Scanner;
public class Student_ {
	Scanner scan = new Scanner(System.in);
	String name;
	int marks = 0;
	
	public void get_details() {
		System.out.println(" Enter a name ");
		name = scan.nextLine();
		System.out.println(" Enter the marks ");
		marks = scan.nextInt();
		
	}
	
	public void show_details() {
		System.out.println(" The name of the student is " + name);
		System.out.println(marks);
	}
}
