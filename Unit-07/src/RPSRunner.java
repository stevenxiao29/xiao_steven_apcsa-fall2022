//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			response = keyboard.next();
				//read in the player value
		//use while loop response a == response b 
			
			RockPaperScissors game = new RockPaperScissors(response);
			System.out.println(game);
			
	}
}



