package javaPracticeQuestions;

import java.util.InputMismatchException;
import java.util.Scanner;

//Given a 32-bit signed integer, reverse digits of an integer.

public class reverseSignedInteger {

	
	public int reverse(int x) {
		int rev =0;
		while (x!=0){
			rev = rev*10+x%10;
			x=x/10;
		}
		
		try{
			x = (int) (Math.pow(2, 31)-1);
			
		}
		catch (InputMismatchException e){
			System.out.println("Integer overflow");
			return 0;
			
		}
		
		return rev;
		
        
    }
	
	public static void main(String[] args) {
	System.out.println("Enter a integer");
	Scanner s = new Scanner(System.in);
	int x= s.nextInt();
	reverseSignedInteger r = new reverseSignedInteger();
	System.out.println("Reversed interger is:"+r.reverse(x));

	}

}
