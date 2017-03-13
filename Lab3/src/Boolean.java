
import java.util.Scanner;
public class Boolean {
	public static void main(String args[]){
		System.out.println("Please give yes or no aswer");
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Do you think moon is rectangle in shape?");
		String response = keyboard.nextLine();
		if(response == "yes" || response == "y"){
			boolean bool=true;
		}
			else{
				boolean bool=false;
			}
		
		
	}

}
