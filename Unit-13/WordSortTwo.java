//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		//sentence.useDelimiter(" ");
	}

	public void sort()
	{
		for (int i=1; i< wordRay.length; i++)
		   {
		      String word = wordRay[i];
		      int j=i;
		      while(j>0&&word.compareTo(wordRay[j-1])==-1){         
		    	  wordRay[j]=wordRay[j-1];
		         j--;
		      }
		      wordRay[j]=word;
		   }

	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i<wordRay.length; i++)
		{
			output += wordRay[i] + "\n";
		}
		
		return output+"\n\n";
	}
}
