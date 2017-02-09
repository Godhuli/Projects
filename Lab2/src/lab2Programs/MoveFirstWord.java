package lab2Programs;
import java.util.Scanner;
public class MoveFirstWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will move first word of a  sentence to last.");
		System.out.println("Enter a sentence");
		Scanner keyboard = new Scanner(System.in);
String sen= keyboard.nextLine();
String first= sen.split(" ")[0];
	sen= sen.replace(first, "").trim();
	sen= sen+" "+ first;
	System.out.println(sen);
	}
	

}
