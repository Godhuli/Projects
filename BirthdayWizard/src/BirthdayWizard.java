import java.util.Scanner;
public class BirthdayWizard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello I am a birthday wIZARD !");
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the year of your birthdate");
int year = keyboard.nextInt( );
System.out.println("Enter the birthday and I will calculate year of that birthday for you");
int birthday = keyboard.nextInt( );
int calc = year + birthday;
System.out.println("Your "+ birthday+"th birthday will in the year " + calc);

	}

}
