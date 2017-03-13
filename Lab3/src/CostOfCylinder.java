import java.util.Scanner;

public class CostOfCylinder {

	public static void main(String[] args) {
		
			Scanner keyboard = new Scanner(System.in);
			System .out.println("Enter the maximum no. of iteration ");
			int n = keyboard.nextInt();
			for(int i=0;i<n;i++){
				System .out.println("Enter the radius of the cyliner");
				float r = keyboard.nextFloat();
				System .out.println("Enter the volume of the cyliner");
				long v= keyboard.nextLong();
				double h=(v/Math.PI*r*r);
				double c=2*Math.PI*r*(r+h);
				System .out.println("The height of cylinder is "+h+"Cost is "+c);
			
			}
			

	}

}
