//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
	
	public TriangleWord(String word)
	{
		printTriangle(word);
	}
	
	public static void printTriangle(String word)
	{
		int len = word.length();
		String out = "";
		
		
		for (int i  = 1 ; i<=len; i++)
		{
			for (int j = 0; j < i ; j++)
			{
				out += word.substring(0,i);
			}
			
			out += "\n";
		}
		
		System.out.println(out);
	}
}