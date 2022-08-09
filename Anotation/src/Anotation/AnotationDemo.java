package Anotation;
import java.lang.annotation.Annotation;

public class AnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nokia_Series obj=new Nokia_Series("Fire", 4);
		System.out.println(obj.model);
		System.out.println(obj.screensize);	
		
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		
		System.out.println(s.os());
		System.out.println(s.version());
	}

}
