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
		
		ArrayList <Word> wordList = new ArrayList();
		file.nextLine();
//		wordList.add(new Word()) ;

		
		
		
		for (int i = 0 ; i<= size ; i++)
		{
			System.out.println(i);
			Word current = new Word(file.nextLine());

			if (i ==0 )
				wordList.add(current);
			
			else if (current.compareTo(wordList.get(wordList.size()-1))== 1) {
				wordList.add(current);
			}
			else {
				for (int j = wordList.size(); j > 0; j--) {
					if (current.compareTo(wordList.get(j-1))== 1) {
						wordList.add(current);
						break;}
					else if (current.compareTo(wordList.get(j-1))== -1) {
						wordList.add(j-1,current);
						break;
					}
				}
			}
			
		}
		
		//Word w = new Word(file.nextLine());
		
		
		System.out.println(wordList);
		
		








	}
}
