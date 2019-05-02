package javaPracticeQuestions;

public class Palindrome {

	 public boolean isPalindrome(int x) {
	        int rev = 0;
	        int x1=x;
	        if (x1 < 0)
	        return false;
	        
	        while(x1!=0){
	            rev = rev*10 + x1%10;
	            x1=x1/10;            
	        }
	        //System.out.println(rev);
	        //System.out.println(x1);
	        if(rev == x)
	        return true;
	        
	        else return false;
	        
	            
	}
	

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome(-2332));
		

	}

}
