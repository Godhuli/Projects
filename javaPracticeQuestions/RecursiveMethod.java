package javaPracticeQuestions;

public class RecursiveMethod {

	
	
	//using for loop
	public static int factorial( int num){
		int fact=1;
		if(num ==0)
			return 1;
		for(int count=1; count<=num;count++){
			fact = fact * count;
		}
		return fact;
	}
	
	
	//using recursive method
	public static int factorial2(int num){
		int fact=num;
		if(num ==0)
			return 1;
		else{
			fact = fact *(factorial2(num-1));
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial2(4));
		

	}

}
