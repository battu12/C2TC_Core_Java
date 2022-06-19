package class_eg;

import java.util.*;

public class Student {
	static String name = "";
	static int marks = 0;
	public void Print() {
	System.out.println(" Name of the student is "+name);
	System.out.println(" Marks of "+name+" is " +marks);
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println(" Enter the name of the student: ");
	String n = sc.nextLine();
	System.out.println(" Enter the marks of the student: ");
	int m = sc.nextInt();
	name = n;
	marks = m;
	Student obj = new Student();
	obj.Print();
	}
}