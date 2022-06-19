package multilevelinheritance;

public class Grandchild extends Child{
	int salary = 0;
	
	public Grandchild(String n, int a, int s) {
		super(n,a);
		salary = s;
	}
	public void show_salary() {
		System.out.println(" Salary is "+ salary);
	}
}
