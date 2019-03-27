package javaPracticeQuestions;
//reverse an integer

public class reverseInteger {

	public static void main(String[] args) {
		// 1st method using logical algorithm
		
		int num =23456;
		int rev=0;
		while(num !=0){
			rev = rev*10+num%10;
			num =num/10;
		}
		System.out.println(rev);
		
		//second method by using string buffer
		int num2 =23456;
		
		StringBuffer rev2 = new StringBuffer(String.valueOf(num2));
		System.out.println(rev2.reverse());
		

	}

}
