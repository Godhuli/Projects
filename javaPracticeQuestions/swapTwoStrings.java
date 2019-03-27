package javaPracticeQuestions;

//Swap two strigns with out third varaible

public class swapTwoStrings {


	
	public static void main(String[] args) {
		
		
		String firstName= "Green";
		String secondName= "Light";
		
		System.out.println("Before Swapping: ");
		System.out.println("First string is: "+ firstName);
		System.out.println("Second string is: "+ secondName);
		
		firstName = firstName + secondName; //GreenLight
		secondName = firstName.substring(0, firstName.length()-secondName.length());
		firstName =firstName.substring(secondName.length());
		
		System.out.println("Before Swapping: ");
		System.out.println("First string is: "+ firstName);
		System.out.println("Second string is: "+ secondName);
		
		

	}

}
