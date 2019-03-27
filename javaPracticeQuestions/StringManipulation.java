package javaPracticeQuestions;

public class StringManipulation {

	public static void main(String[] args) {
		String message = "This is a very long message.video games are awesome valley.valar morgulas";
		String message1 = "This is a very long message.video games are awesome valley.Valar morgulas";
		
		//Size of a string
		System.out.println("Size of method: "+ message.length());
		//Value at 5th location
		System.out.println("value at 5th location: "+ message.charAt(5));
		//index of v
		System.out.println("index of v: "+ message.indexOf('v'));//first occurrence
		//index of same character but second time
		System.out.println("index of 2nd v: "+ message.indexOf('v', message.indexOf('v')+1));//second occurrence
		//index of same character but second time
		System.out.println("index of 3rd v: "+ message.indexOf('v', message.indexOf(('v')+1)+1));//third occurrence
		//index of a string
		System.out.println("index of string long: "+message.indexOf("valley"));
		//to see of two string are equal
		
		
		Boolean answer = message.equalsIgnoreCase(message1);
		System.out.println(answer);
		//Get the substring
		System.out.println("Printing Substring: "+message.subSequence(0,8));
		// Trimming certain string. Trim will remove before and after space not the space in between.
		// example:
		String message2 = "  Sandhya Good       ";
		System.out.println(message2.trim());
		System.out.println(message2.replaceAll(" ", ""));
		
		// more usage of replaceall
		String date = "01-12-2001";
		System.out.println(date.replaceAll("-", "/"));
		
		//Split method
		String test ="Hello world test selenium";
		String [] testArray = test.split(" ");
		for(int i=0; i<testArray.length;i++){
			System.out.println(testArray[i]);
		}
		
		//Use of concatenate
		String concat = message.concat(message2);
		System.out.println(concat);
		
		String x ="Hello";
		String y ="World";
		int a= 100;
		int b= 200;
		
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		

		
		
		
		

	}

	private static int indexOf(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}