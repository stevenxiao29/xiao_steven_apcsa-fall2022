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
		compChoice = (int) (Math.random()*3);
		
		
		switch(compChoice) {
		  case 0:
			  cChoiceText = "R";

		    break;
		  case 1:
			  cChoiceText = "P";

		    break;
		  case 2:
			  cChoiceText = "S";
			break;
		}
		
		
//		if (compChoice == 0) {
//			cChoiceText = "R";
//		}else if (compChoice == 1) {
//			cChoiceText = "P";
//		}else if (compChoice == 2) {
//			cChoiceText = "S";
//		}
		
//		System.out.println("comp had " + cChoiceText);
//		0=R
//		1=P
//		2=S
		
		if (playChoice.equals("R") && compChoice == 2) {winner = "player";}
		else if (playChoice.equals("P") && compChoice == 0) {winner = "player";}
		else if (playChoice.equals("S") && compChoice == 1) {winner = "player";}
		else if (playChoice.equals("R") && compChoice == 1) {winner = "comp";}
		else if (playChoice.equals("P") && compChoice == 2) {winner = "comp";}
		else if (playChoice.equals("S") && compChoice == 0) {winner = "comp";}
		else if (playChoice.equals("R") && compChoice == 0) {winner = "tie";}
		else if (playChoice.equals("P") && compChoice == 1) {winner = "tie";}
		else if (playChoice.equals("S") && compChoice == 2) {winner = "tie";}
		
		return winner;
	}

	public String toString()
	{
		String output= "fritata";
		String result = determineWinner();
		
		if (result.equals("player")) {
			output= "You win!!! \n" + playChoice + " beats " + cChoiceText ;
		}
		else if (result.equals("comp")){
			output = "you lost :( \n" + cChoiceText + " beats " + playChoice;	
		}		
		else {
			output = "you tied" ;	
		}
		return "player had "+ playChoice + "\ncomputer had " + cChoiceText + "\n" + output + " \n" ;
	}
}
