//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private int compChoice;
	private String cChoiceText = "";


	public RockPaperScissors()
	{
		setPlayers(" ");
		compChoice = (int) (Math.random()*3);
		
		if (compChoice == 0) {
			cChoiceText = "R";
		}else if (compChoice == 1) {
			cChoiceText = "P";
		}else if (compChoice == 0) {
			cChoiceText = "S";
		}
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
		

//		0=R
//		1=P
//		2=S
		
		if ((playChoice == "R" && compChoice == 1)||(playChoice == "S" && compChoice == 0)||(playChoice == "P" && compChoice == 2)) {
			winner = "win";
		}else {
			
		}
		

		return winner;
	}

	public String toString()
	{
		String output= "";

		if (determineWinner().equals("win")) {
			output= "You win!!! \n" + playChoice + " beats " + cChoiceText ;
		}
		else {
			output = "you lost unfortunately " + cChoiceText + " beats " + playChoice;
			
		}
		return output;
	}
}