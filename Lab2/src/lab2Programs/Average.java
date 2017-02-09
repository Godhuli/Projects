package lab2Programs;
import java.util.Scanner;
public class Average {
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a= keyboard.nextInt();
		System.out.println("Enter 2nd number");
		int b= keyboard.nextInt();
		System.out.println("Enter 3rd number");
		int c= keyboard.nextInt();
		float avg = a+b+c/3;
		System.out.println("The average of 3 number is "+ avg);
		
		
	}

}
