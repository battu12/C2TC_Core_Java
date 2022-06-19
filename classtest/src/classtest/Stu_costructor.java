package classtest;

public class Stu_costructor {
// using the constructor
	String name ="";
	int marks = 0;

	public Stu_costructor(String n , int m){
		name = n;
		marks = m;
		
	}
	public void show_details() {
		System.out.println(" Name of the student "+ name);
		System.out.println(" Marks of the syudent "+ marks);
	}
}
