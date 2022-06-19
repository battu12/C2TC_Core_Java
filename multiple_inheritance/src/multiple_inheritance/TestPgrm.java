package multiple_inheritance;
import java.util.*;
public class TestPgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter the name: ");
		String my_name = sc.next();
		System.out.println(" Enter the age: ");
		int my_age =sc.nextInt();
		System.out.println(" Enter the salary: ");
		int my_salary =sc.nextInt();
		
		Man obj = new Man(my_name, my_age, my_salary);
		obj.show_person_details();
		obj.task();
		obj.show_man_details();
	}

}
