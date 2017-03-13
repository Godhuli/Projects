import java.util.Scanner;


public class Sum {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System .out.println("Enter the maximum value of series");
		int max = keyboard.nextInt();
		int sum=0;
		for(int i=1;i<=max;i++){
			sum+= Math.pow(i, 2);
		}
		System .out.println("The sum of the series 1+2^2+3^2+4^2....n^2 is "+sum);
	}

}
