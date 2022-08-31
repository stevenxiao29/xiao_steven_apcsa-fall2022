//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output = "";
		String finalOut = "";
		int finalAmount = 0;
		int subtractBy = 0;
		
		for (int b = 0; b<amount; b++) {
			finalAmount += amount - b +1;
		}
			
		for(int j = 0; j<amount; j++) {
			
			for (int i = 0; i<amount-j;i++) {
				output += letter;
			}
			
			output += " ";
			letter += 1;
		
		}
		for (int q =1; q<amount+1;q++) {
			subtractBy += q;
			finalOut += output.substring(0,finalAmount-(subtractBy)) + "\n";			
			
		}	
		
	//	output += "\n";
// print yx print y-1 x-1   print y-2 x-2
	
		return finalOut;
	}
}