package classtest;
import java.util.Scanner;
public class Student1 {

	public static void main(String[] args) {
		// TO print the constructor function of Stu_constructor
		String my_name = "";
		int my_marks = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("  Enter the student name ");
		String n = scan.nextLine();
		System.out.println(" Enter the marks ");
		int m = scan.nextInt();
		
		Stu_costructor my_obj = new Stu_costructor(n,m);
		my_obj.show_details();
		
	}

}
