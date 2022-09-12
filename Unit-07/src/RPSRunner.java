import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		boolean cont = true;
		//add in a do while loop after you get the basics up and running
		
		do {
			String player = "";
		
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			response = keyboard.next();
				//read in the player value
		//use while loop response a == response b 
			
			RockPaperScissors game = new RockPaperScissors(response);
			System.out.println(game);
			
			out.print("do you want to play again? [Y,N] :: ");
			String flagResp = keyboard.next();
			
			if (flagResp.equals("Y")) {
				cont = true;
			}
			else if (flagResp.equals("N")) {
				cont = false;
				break;
			}
			
		} while (cont == true);
	}
}

