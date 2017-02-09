package lab2Programs;

import java.util.Scanner;
public class RemainderOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a floating point number");
		float x = keyboard.nextFloat();
		float y = x% 2;
		System.out.println("The number u entered is "+ x);
		System.out.println("when divided by 2,remainder is "+y);
		int z = (int)x;
		System.out.println("This is float value "+x+".Typecasted integer value is "+z);
		System.out.println("when divided by 2,remainder is "+z%2);
	}

}
