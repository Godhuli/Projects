
import java.util.Scanner;
public class StringSort {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System .out.println("Enter first string");
	String a=keyboard.nextLine();
	System.out.println("Enter the second string");
	String b=keyboard.nextLine();
	System.out.println("Enter the third string");
	String c=keyboard.nextLine();
	if (a.charAt(0)< b.charAt(0) && b.charAt(0)< c.charAt(0)){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}
	if (a.charAt(0)<c.charAt(0) && c.charAt(0)<b.charAt(0)){
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		}
	if (b.charAt(0)<a.charAt(0)&&a.charAt(0)<c.charAt(0)){
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
	}
	if(b.charAt(0)< c.charAt(0)&& c.charAt(0)<a.charAt(0)){
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	}
	if(c.charAt(0)< a.charAt(0) &&a.charAt(0)< b.charAt(0)){
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
	if(c.charAt(0)< b.charAt(0) && b.charAt(0)<a.charAt(0)){
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}
		
	
	}

}
