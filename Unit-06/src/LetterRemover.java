//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}
	
	public LetterRemover(String a, char temp)
	{
		//call set
		setRemover(a, temp);
	}
	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
		
		
		
	}

	public String removeLetters()
	{
		
		String cleaned=sentence;

		
		for(int i = 0; i<sentence.length();i++) {
					
			if(sentence.charAt(i)=='a') {
				cleaned = sentence.replace("a","");
				
			}
					
		}
		
	
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + " \n" + removeLetters();
	}
}