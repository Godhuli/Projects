
import java.util.Scanner;
public class PaperScissorRock {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System .out.println("player1 enter p,s,or,r ");
		char Player1=keyboard.next().charAt(0);
		System .out.println("player2 enter p,s,or,r ");
		char Player2=keyboard.next().charAt(0);
		
		  if ((Player1 =='R' ||Player1 == 'r') && (Player2 == 'S' || Player2 == 's'))
	       {
	         System.out.println( " Player1 wins, Rock beats scissors");
	       }
	       else if ((Player1 == 'S' ||Player1 == 's') && (Player2 =='R' ||Player2 == 'r'))
	       {
	    	   System.out.println("Player2 wins, Rock beats scissors");
	       }
	       else if ((Player1 =='P' ||Player1 == 'p') && (Player2 == 'R' ||Player2 == 'r'))
	       {
	    	   System.out.println("Player1 wins, Paper covers rock");
	       }
	       else if ((Player1 == 'R' ||Player1 == 'r') && (Player2 =='P' ||Player2 == 'p'))
	       {
	    	   System.out.println("Player2 wins, Paper covers rock");
	       }
	       else if ((Player1 == 'S' || Player1 =='s') && (Player2 == 'P' ||Player2 ==  'p'))
	       {
	    	   System.out.println("Player1 wins, Scissors cuts paper");
	       }
	       else if ((Player1 == 'P' ||Player1 == 'p') && (Player2 == 'S' ||Player2 == 's'))
	       {
	    	   System.out.println( "Player2 wins, Scissors cuts paper");
	       }
	       else if ((Player1 =='R' || Player1 =='r' ||Player1 == 'S' ||Player1 == 's' ||Player1 == 'P' ||Player1 == 'p') == (Player2 =='R' ||Player2 == 'r' ||Player2 =='S' ||Player2 == 's' ||Player2 == 'P' ||Player2 == 'p'))
	       {
	    	   System.out.println("It's a Draw! No one wins!");
	       }
	  

	}

}


