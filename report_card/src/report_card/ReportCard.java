package report_card;
import java.util.*;
public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the marks: ");
		int marks = sc.nextInt();
		
		if(marks<40) {
			System.out.println(" Fail ");
		}else if(marks>40 && marks<50) {
			System.out.println(" E Grade ");
		}else if(marks>50 && marks<60) {
			System.out.println(" D Grade ");
		} else if(marks>60 && marks<70) {
			System.out.println(" c Grade ");
		}else if(marks>70 && marks<80) {
			System.out.println(" B Grade ");
		}else if(marks>80 && marks<90) {
			System.out.println(" A Grade ");
		}else if(marks>90 && marks<=100) {
			System.out.println(" S Grade ");
		}
		else {
			System.out.println(" Invalid marks ");
		}
	}

}
