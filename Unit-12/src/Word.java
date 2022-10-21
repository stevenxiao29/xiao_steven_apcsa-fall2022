//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		s = word;
	}

	public int compareTo( Word rhs )
	{		
		
		 if (rhs.getWord().length()== word.length()) {
				return word.compareTo(rhs.getWord());
		} 
		 return rhs.getWord().length()- word.length();
	}

	public String getWord() {
		return word;
	}

	public String toString()
	{
		String out = "";
		
		
		
		return out;
	}
}