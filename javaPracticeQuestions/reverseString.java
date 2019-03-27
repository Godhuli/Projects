package javaPracticeQuestions;

//How to reverse a string without using existing function?

public class reverseString {

	public static void main(String[] args) {
		// 1st method using for loop
		
		String s = "Banana";
		int len = s.length();
		String rev ="";
		for (int i =len-1;i>=0;i--){
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		//Second method
		StringBuffer s1 = new StringBuffer(s);
		System.out.println(s1);
		System.out.println(s1.reverse());
		
		

	}

}
