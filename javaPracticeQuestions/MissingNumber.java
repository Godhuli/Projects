package javaPracticeQuestions;
//Find missing no. in an array.

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {-1,0,1,2,3,5,6,7,8,9,10};
		int len = a.length;
		System.out.println(len);
		int sum =0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		System.out.println(a.length);
		System.out.println(sum);
		int sum2= 0;
		for (int j=-1; j<=10;j++){
			sum2 += j;
		}
		System.out.println(sum2);
		
		int missingNo= sum2-sum;
		System.out.println("The missing no. is:" + missingNo);
		 
		
		

	}

}
