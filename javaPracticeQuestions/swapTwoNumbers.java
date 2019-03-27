package javaPracticeQuestions;

public class swapTwoNumbers {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		/*
		//By using third variable
		int z =0;;
		z =x;
		x=y;
		y=z;
		System.out.println(x);
		System.out.println(y);
		
		*/
		
		/*
		//By using + operator
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
		*/
		
		
		//By using * operator
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println(x);
		System.out.println(y);

	}

}
