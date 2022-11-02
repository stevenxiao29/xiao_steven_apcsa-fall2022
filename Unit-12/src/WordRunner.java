//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		
		Word[] wordList = new Word[size];
		file.nextLine();
//		wordList.add(new Word()) ;
		
		for (int i = 0 ; i< size ; i++)
		{
			wordList[i] = new Word(file.nextLine());
		}
		
		Arrays.sort(wordList);
		//Word w = new Word(file.nextLine());
		
		
		for (int i = 0 ; i< size ; i++)
		{
			System.out.println(wordList[i]);	
		}
		
	

	}
}