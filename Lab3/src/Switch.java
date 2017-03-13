
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		
		System.out.println("To know the gradevalue,enter the grade either A, B,C or D");
		
		Scanner keyboard =new Scanner(System.in);
		char grade=keyboard.next().charAt(0);
		switch(grade){
		case'A':
		System .out.println("gradevalue is 4.0");
		break;
		case'B':
		System .out.println("gradevalue is 3.0");
		break;
		case'C':
		System .out.println("gradevalue is 2.0");
		break;
		case'D':
		System .out.println("gradevalue is 1.0");
		break;
		default:
		System .out.println("gradevalue is 0.0 Enter the valid grade");
			
		}
		
		

	}

}
