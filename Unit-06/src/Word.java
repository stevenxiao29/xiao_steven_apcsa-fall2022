//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
	}

	public char getFirstChar()
	{
		
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		return back;
	}

 	public String toString()
 	{
 		return "" + getFirstChar() + "\n" + getLastChar();
	}
}