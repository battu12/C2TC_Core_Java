package ArrayListDemo;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Student> list=new ArrayList<Student>();
		Student s1=new Student(1,"Ash");
		Student s2=new Student(2,"Corner");
		Student s3=new Student(3,"James");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student st:list) {
			System.out.println(st.id +" "+st.name );
	}

	}

}
