package multiple_inheritance;

public class Man extends Person implements Father {
	int salary = 0;
	public Man(String n, int a, int s) {
		super(n,a);
		salary =s;
		
	}
	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println(" Earns salary of ");
	}
	public void show_man_details() {
		System.out.println(salary);
	}

}
