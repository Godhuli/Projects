package javaPracticeQuestions;

public class ArmstrongNumber {

	
	
	public boolean isArmstrongNumber(int num) {
		int originalNum;
		int remainder;
		int result = 0;
		originalNum = num;
		int count =0;
		
		
		
		while(num!=0){
			num /=10;
			++count;			
		}
		System.out.println(count);
			
		
		while(originalNum !=0){
		remainder = originalNum%10;
		result += Math.pow(remainder,count);
		originalNum /= 10; 
						
		}
		
		if (result == num)
			return true;
		else return false;
		
		

	}
	
	public static void main(String[] args) {
		ArmstrongNumber arm = new ArmstrongNumber();
		System.out.println(arm.isArmstrongNumber(153));
		

	}

}
