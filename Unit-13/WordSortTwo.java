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
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		Arrays.sort(wordRay);
		
//		for (int i=1; i< wordRay.length; i++)
//		   {
//		      String word = wordRay[i];
//		      int j=i;
//		      while(j>0&&word.compareTo(wordRay[j-1])==-1){         
//		    	  wordRay[j]=wordRay[j-1];
//		         j--;
//		      }
//		      wordRay[j]=word;
//		   }

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
