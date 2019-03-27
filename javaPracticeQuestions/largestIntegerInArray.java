package javaPracticeQuestions;
//Largest Integer in Array

public class largestIntegerInArray {

	public static void main(String[] args) {
	int [] numbers = {12, 3456, 87, 45678, 99, 9300456};
	int large= numbers[0];
	int small= numbers[0];
	for (int i=0;i<numbers.length;i++){
		if (numbers[i]>large){
			large= numbers[i];
		if (numbers[i]<small){
			small = numbers[i];
			
		}
			
				
		}
	}
	System.out.println("Largest number is: "+large);
	

	}

}
